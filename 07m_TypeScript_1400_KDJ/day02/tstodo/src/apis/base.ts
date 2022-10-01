import axios from "axios";

export const axiosApiInstance = axios.create({
  baseURL: "http://localhost:9000",
  headers: {
    "Content-Type": "application/json",
  },
  withCredentials: true,
});

axiosApiInstance.interceptors.request.use(
  async (config) => {
    return config;
  },
  (error) => {
    throw new Error(error);
  }
);
