<template>
    <div>
      <el-container>
        <el-header style="width: 1470px; padding-right: 0%;">
            <the-navmenu ></the-navmenu>
        </el-header>
        <el-container>
          <el-main style="padding: 0%;"><router-view></router-view></el-main>
        </el-container>
      </el-container>
    </div>
  </template>
  
  <script>
  import TheNavmenu from '../components/Home/Meun.vue';
  export default {
    name: "Main",
    components:{
        TheNavmenu
    }
  }
  </script>
  
  <style scoped>
  
  </style>
