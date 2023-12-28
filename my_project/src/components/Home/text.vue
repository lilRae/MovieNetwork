<template>
  <div>
    <div class="press-center">
      <h1>新闻中心</h1>
      <section>
        <el-carousel height="450px" ref="carousel" @change="carousel">
          <el-carousel-item v-for="item in carouseData" :key="item.id">
            <h3 class="small">
              <img :src="item.url" alt="" />
            </h3>
          </el-carousel-item>
        </el-carousel>
      </section>
      <div>
        <section
          v-for="(item, index) in selectData"
          :key="index"
          @click="controlSwiper(item.id, index)"
        >
          <p :class="{ active: active == item.id }">{{ item.title }}</p>
          <span></span>
          <i>{{ item.font }}</i>
        </section>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      bannerheight: "",
      active: 0,
      selectData: [
        {
          url: require("./img/cqsl2.jpg"),
          title: "我是标题我是标题我是标题我是标题111111111”",
          font: "已阅读36次",
          data: "时间：2021-04-19",
          id: 0,
        },
        {
          url: require("./img/cqsl2.jpg"),
          title: "我是标题我是标题我是标题我是标题222222222",
          font: "已阅读36次",
          data: "时间：2021-04-19",
          id: 1,
        },
        {
          url: require("./img/cqsl2.jpg"),
          title: "我是标题我是标题我是标题我是标题333333333",
          font: "已阅读36次",
          data: "时间：2021-04-19",
          id: 2,
        },
        {
          url: require("./img/cqsl2.jpg"),
          title: "我是标题我是标题我是标题我是标题444444444",
          font: "已阅读36次",
          data: "时间：2021-04-19",
          id: 3,
        },
      ],
      carouseData: [
        { url: require("./img/cqsl2.jpg") },
        { url: require("./img/cqsl2.jpg") },
        { url: require("./img/cqsl2.jpg") },
        { url: require("./img/cqsl2.jpg") },
      ],
    };
  },
  methods: {
    controlSwiper(id, index) {
      this.active = id;
      this.$refs.carousel.setActiveItem(index); // 注：这一句是方法成功的关键，别玩了在轮播图上加上ref=“carousel”
    },
    carousel(e) {
      this.active = e;
    },
  },
};
</script>
<style lang="scss" scoped>
.press-center {
  position: relative;
  height: 580px;
  margin-bottom: 120px;
  h1 {
    text-align: center;
    margin: 80px 0;
    color: #333;
  }
  .active {
    border-bottom: 2px solid #39ae9c;
  }
  > section {
    width: 45%;
    height: 450px;
    img {
      width: 100%;
      height: 100%;
    }
  }
  > div {
    height: 450px;
    position: absolute;
    right: 0;
    top: 20%;
    width: 50%;
    section {
      position: relative;
      height: 25%;
      p {
        position: absolute;
        font-size: 24px;
        top: 8%;
        left: 6%;
      }
      p:hover {
        cursor: pointer;
      }
      span {
        padding: 16px 3px;
        background: #39ae9c;
        position: absolute;
        top: 26%;
      }
      font {
        position: absolute;
        left: 6%;
        bottom: 16%;
        color: #666;
      }
      i {
        color: #666;
        position: absolute;
        right: 2%;
        bottom: 16%;
      }
    }
  }
}
</style>
