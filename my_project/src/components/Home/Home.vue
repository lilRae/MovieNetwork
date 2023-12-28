<template>
  <div class="home">
    <!-- <the-meun></the-meun> -->
    <the-carousel></the-carousel>
    <!-- <the-detail></the-detail> -->
    <the-check ></the-check>
    <el-backtop :right="100" :bottom="100" />
  </div>
</template>

<script>
import TheCarousel from "@/components/Home/Carousel.vue";
import TheDetail from "@/components/Home/Detail.vue";
import TheMeun from "@/components/Home/Meun.vue";
import TheCheck from "@/components/Home/Check.vue";

export default {
  name: "Home",
  components: {
    TheCarousel,
    TheDetail,
    TheMeun,
    TheCheck,
 
  },
};
</script>
<style>
/* .home{ */
/* height:1000px; */
/* 设置超出滚动 */
/* overflow:auto;
} */

body {
  height: 700px;
}
</style>
