import { createRouter, createWebHashHistory } from "vue-router";
import Main from "../views/Main.vue";
import Login from "../views/Login.vue";
import Register from "../views/Register.vue";
import HomeView from "../views/HomeView.vue";
import Serch from "../components/Serch/Serch.vue";
import Person from "../components/Person/Personal.vue";
const routes = [
  {
    path: "/",
    name: "Main",
    component: Main,
    redirect:"/home",
    children: [
      {
        path:'/home',
        name:'home ',
        component:HomeView,
     },
     {
      path:'/serch',
      name:'serch ',
      component:Serch,
   },
   {
    path:'/person',
    name:'person',
    component:Person,
 },
    ]
  },
  {
    path: "/about",
    name: "about",
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () =>
      import(/* webpackChunkName: "about" */ "../views/AboutView.vue"),
  },
  {
    path:'/login',
    name:'login',
    component:Login
  },
  {
    path:'/Register',
    name:'Register',
    component:Register
  },
];

const router = createRouter({
  history: createWebHashHistory(),
  routes,
});

export default router;
