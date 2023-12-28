<template>
  <div class="user-profile">
    <header>
      <h1> {{ usr.nickname }}的个人中心</h1>
      <p class="user-info">粉丝：1000 | 关注：500</p>
    </header>
    <nav>
      <ul>
        <li @click="changeTab('profile')" :class="{ active: activeTab === 'profile' }">个人资料</li>
        <li @click="changeTab('posts')" :class="{ active: activeTab === 'posts' }">创建活动</li>
        <li @click="changeTab('favorites')" :class="{ active: activeTab === 'favorites' }">收藏电影</li>
      </ul>
    </nav>

    <div v-if="activeTab === 'profile'">
     <the-describe></the-describe>
</div>
          <div v-else-if="activeTab === 'posts'">创建活动</div>
          <div v-else-if="activeTab === 'favorites'">收藏电影</div>
          <!-- 实际内容 -->
        </div>
        <div><TheShip></TheShip></div>
</template>

<script>
import TheDescribe from "./Describe.vue";
import TheShip from "./Ship.vue";

export default {
  data() {
    return {
      username: "raeeee", // 替换为实际用户名
      activeTab: "profile",
      usr:localStorage.getItem("usr") ? JSON.parse(localStorage.getItem("usr")):{}, 
    }
  },
  methods: {
    changeTab(tab) {
      this.activeTab = tab;
    },
  },
  components:{
    TheDescribe,
    TheShip,
   }   
};
</script>

<style scoped>
.user-profile {
  max-width: 80%;
  max-height: 100%;
  margin: 0 auto;
  padding: 20px;
  font-family: 'Arial', sans-serif;
  background-color: #f5f5f5; /* Lighter gray background */
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
  border-radius: 10px;
}

header {
  text-align: center;
  background-color: #dce3d7; /* Light gray header background */
  color: #acb3a8; /* Dark gray text color */
  padding: 15px;
  border-radius: 10px 10px 0 0;
}

.user-info {
  font-size: 14px;
  margin-top: 10px;
  color: #666; /* Medium gray text color */
}

nav {
  margin-top: 20px;
}

ul {
  list-style: none;
  padding: 0;
  margin: 0;
  display: flex;
}

li {
  cursor: pointer;
  padding: 10px;
  margin-right: 10px;
  background-color: #efe9e9; /* Light gray button background */
  border-radius: 5px;
  transition: background-color 0.3s ease, color 0.3s ease;
  color: #a8b8a5; /* Dark gray text color */
}

li.active {
  background-color: #d4dad5; /* Slightly darker gray active button background */
  color: #a8b8a5;
}

.tab-content {
  margin-top: 20px;
  background-color: #fff;
  padding: 20px;
  border-radius: 0 0 10px 10px;
  box-shadow: 0 4px 8px rgba(92, 91, 91, 0.1);
}

.fade-enter-active, .fade-leave-active {
  transition: opacity 0.5s;
}

.fade-enter, .fade-leave-to {
  opacity: 0;
}
</style>