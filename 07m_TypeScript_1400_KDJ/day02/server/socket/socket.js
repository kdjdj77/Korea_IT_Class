import { Server } from "socket.io";
// 소켓서버를 사용하기 위해서 socket.io 라이브러리 설치 후 import

const SoketServer = (server) => {
    const io = new Server(server, {
        path: "/socket.io",
        cors: {
            origin: "*",
            credentials: true,
        },
    });
    // 소켓 서버 생성(옵션)
    // cors?
    /* 
        한 도메인을 가진 웹페이지가 다른 도메인 요청을 엑세할 수있는 보안
        서버와 클라이언트가 서로 정해진 헤더를 통해 요청하고 응답할지 정하는 방식

        이러한 보안 방식에서는 다른 도메인이 요청하게 되면 에러가 발생
        이러한 보안 방식을 회피하기 위하여 cors를 모두 승인할 수 있도록 조치
    */

    // socket.io도 라이브러리지만 원리가 쉽고
    // socket 관련해서는 자주 사용하는 거니까 원리 정도는 이해해야
    // 소켓 서버를 만들기 용이

    // 명령어를 정의, 명령어 후 일어날 행동
    // 클라이언트 -> socket 명령어 "connetion" 전달 -> 해당 유저에 socket에 관한 값이 반환
    // socket서버에 연결용
    io.on("connection", (socket) => {
        console.log("유저입장");

        // 명령어
        // socket (유저구분값, 소켓 연결 관련 객체)
        socket.on("joinRoom", (roomId, username) => {
            //on("명령어", (소켓 전송시 보낸 데이터))
            // ---> 클라이언트에 joinRoom이라는 명령어와 함께 데이터를 같이 보낸다
            // on은 서버가 소켓 메시지를 받는 함수

            console.log(roomId);
            console.log(`${username}님 접속`);
            socket.join(roomId);
            // socket 서버 안에서도 방을 만들 수 있음
            // 해당 방에 입장

            // 해당 방 전체(모든 인원)에게 emit 소켓 메시지를 보냅니다
            // emit("key", 데이터)
            socket.broadcast.to(roomId).emit("user-connected", {
                username: username, // 클라이언트가 전달한 입장한 유저 이름
                roomId: roomId, // 클라이언트가 전달한 방번호
                socketId: socket.id, //유저 고유 값
            });

            // 클라이언트가 disconnect 명령어를 보냈음
            socket.on("disconnect", () => {
                // 소켓서버가 해당 명령어 받고 그 방에 있는 사람들에게 이 사람이 나갔다는
                // 소켓 메시지를 클라이언트에게 보내주는겁니다
                // emit = 소켓서버에서 클라이언트로 보내는 것 ( 클라이언트 -> 소켓서버 )
                socket.broadcast.to(roomId).emit("user-disconnected", username);
                socket.leave(roomId);
            });

            // 한 대화방 내에 있는 단체 채팅
            socket.on("roomchat", (message) => {
                socket.broadcast.to(roomId).emit("user-roomchat", {
                    username: message.username,
                    message: message.message,
                });
            });
        });

        // 1:1 채팅, 귓속말
        socket.on("chat", (message) => {
            io.to(message.targetSocketId).emit("user-chat", {
                from: message.userName,
                message: message.message,
            });
        });
    });
};
export default SoketServer;
