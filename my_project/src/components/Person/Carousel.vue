<!-- 广告 -->
<template>
    <!-- <div class="container"> -->
  <div class="block">
    <el-carousel height="150px">
      <el-carousel-item v-for="item in items" :key="item">
       <img :src="item.imgUrl">
      </el-carousel-item>
    </el-carousel>
  </div>
<!-- </div> -->
</template>
<script>
  export default {
    data(){
      return{
          items:[
                      {imgUrl:require('./img/1.jpg'),},
                      {imgUrl:require('./img/2.jpg'),},
                      {imgUrl:require('./img/3.jpg'),},
                      {imgUrl:require('./img/4.jpg'),},
      ]
      
    }
  }
}
</script>
<style>
  .el-carousel__item h3 {
    color: #475669;
    font-size: 14px;
    opacity: 0.75;
    line-height: 150px;
    margin: 0;
  }

  .el-carousel__item:nth-child(2n) {
     background-color: #99a9bf;
  }
  .el-carousel__item:nth-child(2n+1) {
     background-color: #d3dce6;
  }
  /* .container{
    position: absolute;
    left: 0%;
    right: 25%;
    width: 100%;
  }                   */
</style>

  

