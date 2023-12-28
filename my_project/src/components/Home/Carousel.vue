<!-- 广告 -->
<template>
  <!-- <div class="container"> -->
  <div class="block">
    <el-carousel height="500px" ref="carousel" @change="carousel">
      <el-carousel-item v-for="(item, index) in items" :key="item.id">
        <img :src="item.imgUrl" class="img" />
        <h1>{{ item.index }}</h1>
      </el-carousel-item>
    </el-carousel>
    <div class="main">
      <section
        v-for="(item, index) in details"
        :key="index"
        class="hidden"
        :class="{ active: active == item.id }"
        @click="controlSwiper(item.id, index)"
      >
        <!-- <div class="hidden" :class="{active: active == item.id}">  -->
        <h1 style="margin-top: 1%">{{ item.vedioname }}</h1>
        <h3 style="margin-top: 0%">{{ item.ename }}</h3>
        <h3 v-if="item.class_name==1">电影 | {{ item.auther }} | {{ item.nation }}</h3>
        <h3 v-else-if="item.class_name==2">书籍 | {{ item.auther }} | {{ item.nation }}</h3>
        <h3 v-else="item.class_name==3">音乐 | {{ item.auther }} | {{ item.nation }}</h3>
        <h4 v-if="item.class_name==1"> 上映时间:{{ item.ontime }}</h4>
        <h4 v-else-if="item.class_name==2"> 出版时间:{{ item.ontime }}</h4>
        <h4 v-else="item.class_name==3"> 发行时间:{{ item.ontime }}</h4>
        <div class="flag" v-observe="'active'">
        <p class="text">{{ item.text }}</p></div>
        <!-- </div> -->
      </section>
    </div>
  </div>
  <!-- </div> -->
</template>
<script>
import request from "@/utils/request";
import { loadRouteLocation } from "vue-router";
export default {
  data() {
    return {
      active: 0,
      items: [
        { imgUrl: require("./img/cq6.jpg") },
        { imgUrl: require("./img/yz.jpg") },
        { imgUrl: require("./img/name2.jpg") },
        { imgUrl: require("./img/book.jpg") },
        { imgUrl: require("./img/wanqing.jpg") },
      ],
      details: [
        // {
        //   id: 0,
        //   vedioname: "重庆森林",
        //   edioname: "重庆森林",
        //   ename: "Chungking Express",
        //   nation: "中国香港",
        //   ontime: "上映日期: 1994-07-14(中国香港)",
        //   auther: "王家卫",
        //   text: "编号为223的警察（金城武）失恋后患上失恋综合症，在与金发女杀手（林青霞）擦肩而过又离奇相遇并有了一晚温情后，原本以为包括“爱情”在内的所有东西都有保质期的他意外地迎来心灵的短暂温暖。可是，他们的爱情还是结束了.快餐店新来的女招待阿菲（王菲）爱上了时常光顾快餐店的编号 为663的警察（梁朝伟），因拆了他的女友（周嘉玲）留在快餐店给他的“分手” 信，阿菲知晓了他的心情，偷拿到他的钥匙趁他不在时常潜入他家，一边梦游一边悄悄地改变他的生活，终在被他撞见时令其感受到情感的回归。然而，这才是他们爱情的开始。",
        // },
        // {
        //   id: 1,
        //   vedioname: "重庆",
        //   ename: "Chungking Express",
        //   nation: "中国香港",
        //   ontime: "上映日期: 1994-07-14(中国香港)",
        //   auther: "王家卫",
        //   text: "编号为223的警察（金城武）失恋后患上失恋综合症，在与金发女杀手（林青霞）擦肩而过又离奇相遇并有了一晚温情后，原本以为包括“爱情”在内的所有东西都有保质期的他意外地迎来心灵的短暂温暖。可是，他们的爱情还是结束了.快餐店新来的女招待阿菲（王菲）爱上了时常光顾快餐店的编号 为663的警察（梁朝伟），因拆了他的女友（周嘉玲）留在快餐店给他的“分手” 信，阿菲知晓了他的心情，偷拿到他的钥匙趁他不在时常潜入他家，一边梦游一边悄悄地改变他的生活，终在被他撞见时令其感受到情感的回归。然而，这才是他们爱情的开始。",
        // },
      ],
    };
  },
  methods: {
    load(){
      request.get("http://47.109.151.69:9090/vedio").then(res=>{
               console.log(res);
               this.details=res||[];
      });
    },
    controlSwiper(id, index) {
      this.active = id;
      this.$refs.carousel.setActiveItem(index); // 注：这一句是方法成功的关键，别玩了在轮播图上加上ref=“carousel”
    },
    carousel(e) {
      this.active = e;
    },
   
  },
  mounted () { //这个属性就可以，在里面声明初始化时要调用的方法即可
      // we can implement any method here like
     this.load();
    }
  
};
</script>
<style scoped>
.el-carousel__item h3 {
  color: #475669;
  font-size: 14px;
  opacity: 0.75;
  line-height: 150px;
  margin: 0;
}

.el-carousel__item:nth-child(2n) {
  background-color: #343940;
  opacity: 30;
}
.el-carousel__item:nth-child(2n + 1) {
  background-color: #82868b;
  opacity: 30;
}
.img {
  height: 100%;

  object-fit: cover;
}
.block {
  height: 700px;
}
.hidden {
  display: none;
}
.active {
  display: block;
}
h1{
  font-size: 23px;
  margin-bottom: 1%;
}
</style>
