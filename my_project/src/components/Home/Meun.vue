<template>
  <div>
    <el-menu
      class="el-menu-demo"
      mode="horizontal"
      :ellipsis="false"
      @select="handleSelect"
      active-text-color="#82868b"
      :default-active="this.$route.path"
      router
    >
    <div class="item"></div>
      <el-menu-item index="/home">首页</el-menu-item>
      <el-menu-item index="/serch">查找</el-menu-item>
      <el-menu-item  v-if="usr.status!=1" index="/login" style="margin-right: 5%;">登录</el-menu-item>
      <el-sub-menu index="4"  v-if="usr.status==1">
        <!-- <template #title disabled >{{ usr.nickname }}</template> --> 
        <template v-if="usr.status==1" template #title disabled >  欢迎您：{{ usr.nickname }}
        </template>
        <el-menu-item  v-if="usr.status==1" index="/person">主页</el-menu-item>
        <el-menu-item  v-if="usr.status==1" index="4-2">设置</el-menu-item>
        <el-menu-item  v-if="usr.status==1" @click="out">退出登录</el-menu-item>
      </el-sub-menu>
    </el-menu>
  </div>
</template>
<script>
  import request from "@/utils/request";
  import bus from "@/bus.js";
export default{
  data() {
    return {
      usr:localStorage.getItem("usr") ? JSON.parse(localStorage.getItem("usr")):{},
      ausr:1,
    }
  },
methods: {
  menuClick(item) {
      this.$router.push(item.path)
       },
       out(){
          this.usr.status=0;
          // bus.$emit('val',this.usr);
         localStorage.removeItem("usr");
         localStorage.clear();    
          location.reload();
          this.$router.push("/home");
          this.$message.success("退出成功");
         
       }
}, 
computed:{
        noChildren(){
      return this.menuData.filter(item => !item.children)
    }
      }
}
</script>
<style>
.item {
  width: 100%;
}
li {
  margin-bottom: 0;
}
</style>