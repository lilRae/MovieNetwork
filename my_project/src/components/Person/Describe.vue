
<template>
    <div class="describe">
  
    <el-descriptions class="margin-top" title="个人信息" :column="4" :size="size" border>
      <template slot="extra">
        <el-button type="primary" size="small">更改</el-button>
      </template>
      <el-descriptions-item>
      <el-avatar src="https://cube.elemecdn.com/0/88/03b0d39583f48206768a7534e55bcpng.png"></el-avatar>
    </el-descriptions-item>
      <el-descriptions-item>
        <template slot="label">
         
          <i class="el-icon-user"></i>
          
        </template>
        用户名:
        {{ usr.nickname }}
      </el-descriptions-item>

      <el-descriptions-item>
        <template slot="label">
          <i class="el-icon-user"></i>
          <p></p>
        </template>
        账号:{{usr.usrname}}
      </el-descriptions-item>
      <el-descriptions-item>
        <template slot="label">
          <i class="el-icon-mobile-phone"></i>   
        </template>
        手机号:{{ usr.phone }}
      </el-descriptions-item>    
    </el-descriptions>
</div>
  </template>
  
  <script>
  import  TheCard  from './Card.vue';
  import  TheMytext from './Mytext.vue';
    export default {
     components:{
        TheCard,
        TheMytext
   },
   data() {
    return {
      usr:localStorage.getItem("usr") ? JSON.parse(localStorage.getItem("usr")):{},
      ausr:1,
    }
  },  
    };
  </script>
  <style>
/* .describe{
    position: absolute;
    left:30%;
} */
</style>