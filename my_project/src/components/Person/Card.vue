<template>
    <div class="containers">
        <el-row :gutter="12">
    <el-col :span="6" >
      <el-card shadow="hover" class="card">
        <i class="el-icon-s-order"></i>
        我的下载
      </el-card>
    </el-col>
    <el-col :span="6">
      <el-card shadow="hover" class="card">
        <i class="el-icon-document-checked"></i>
        我的上传
      </el-card>
    </el-col>
    <el-col :span="6">
      <el-card shadow="hover" class="card">
        <i class="el-icon-more"></i>
        更多功能
      </el-card>
    </el-col>
  </el-row>  
    </div>
</template>
<style>
.containers{
    margin-top: 5%;
    /* background-color: rgb(243, 241, 239);
    position: fixed;
    flex-direction: row;
    justify-content: center; */
}
.card
{
  border-radius: 10%;
 
}</style>
