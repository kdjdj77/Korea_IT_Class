import { RefreshAuth } from "../util/refreshAuth.js";
import passport from "passport";
import { FailureData } from "../util/resultData.js";

export const jwtAuth = (req, res, next) => {
    passport.authenticate("jwt", { session: false }, (err, user) => {
        // jwt x
        if (err || !user) {
            // refresh o jwt x
            if (req.cookies.refresh) {
                const refreshAuth = RefreshAuth(req.cookies.refresh, req.user);
                if (refreshAuth) {
                    return next();
                }
                res.status(403).json(
                    FailureData("인증정보가 올바르지 않습니다")
                );
            } else {
                // refresh x jwt x
                res.status(403).json(FailureData("세션이 만료되었습니다"));
            }
        }
        // jwt o refresh o
        if (req.cookies.refresh) {
            const refreshAuth = RefreshAuth(req.cookies.refresh, user);
            if (refreshAuth) {
                return next();
            }
            res.status(403).json(FailureData("인증정보가 올바르지 않습니다"));
            UserService.logout(req, res, next);
        }
        // jwt o refresh x
        // refresh reissue
        const refresh = jwt.sign(
            { token: user.token },
            process.env.SECRET_REFRESH_TOKEN_KEY
        );
        console.log("jwt");
        res.cookie("refresh", refresh, {
            maxAge: 14 * 24 * 60 * 60000,
            httpOnly: true,
        });
        next();
    })(req, res, next);
};
