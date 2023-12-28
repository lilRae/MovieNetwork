<script setup>
import First from "./first.vue";
import Second from "./second.vue";
import Third from "./third.vue";
import Fourth from "./fourth.vue";
import Fifth from "./fifth.vue";
import { ref } from "vue";

const currentTab = ref("Home");

const tabs = {
  First,
  Second,
  Third,
  Fourth,
  Fifth,
};
</script>

<template>
  <div class="demo">
    <el-text  class="mx-1" type="info" size="large">
      一周推荐 
      <el-text tag="sub" size="small" style="margin-right: 5%;"  class="mx-1" type="info">2024.1.7 - 2024.1.14</el-text>
    </el-text>
    <el-button
      size="large"
      v-for="(_, tab) in tabs"
      :key="tab"
      :class="['tab-button']"
      @click="currentTab = tab"
    >
      {{ tab }}
    </el-button>
    <component :is="tabs[currentTab]" class="tab"></component>
  </div>
</template>

<style scoped>
.demo {
  font-family: sans-serif;
  border: 1px solid #eee;
  border-radius: 2px;
  padding: 20px 30px;
  margin-top: 20em;
  margin-bottom: 40px;
  user-select: none;
  overflow-x: auto;
}
.el-button + .el-button {
  margin-left: 1px;
}
.tab {
  border: 1px solid #ccc;
  padding: 10px;
  height: 1300px;
  margin-top: 1%;
}

</style>
