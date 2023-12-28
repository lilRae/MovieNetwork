import { createApp } from "vue";
import App from "./App.vue";
import router from "./router";
import store from "./store";
import ElementPlus from "element-plus";
import "./assets/main.css";
import "element-plus/dist/index.css";
import {AxiosInstance } from "axios";
import axios from "@/utils/request";
import { observe } from "./directives";
//全局配置Axios
// let app=createApp(App)

// app.use(router)
// app.use(store)
// app.use(ElementPlus)
// app.config.globalProperties.$requst = axios; //this.Axios
// app.mount('#app')
createApp(App).use(store).use(router).use(ElementPlus).directive("observe",observe).mount("#app");


