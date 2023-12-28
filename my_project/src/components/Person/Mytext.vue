<!-- 我的文档 -->
<template>
    <div class="mytext">
        <el-collapse accordion>
  <el-collapse-item>
    <template slot="title">
      我的文档<i class="el-icon-box"></i>
    </template>
    <div><i class="el-icon-document"></i><a href="../test/test.pdf"> 文件一</a></div>
  </el-collapse-item>
</el-collapse> 
    </div>
</template>
<script>
// export default{
//     data(){
//         return{
//         url:'file//E:/test.pdf',
//         src: 'https://view.officeapps.live.com/op/embed.aspx?src='
//     }
// },
// mounted(){
//     this.src +=this.url
// }
// }
 </script>
<style>
.mytext{
    margin-top: 5%;
}
  </style>