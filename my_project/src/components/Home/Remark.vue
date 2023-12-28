<template>
    <div class="remark" >
        <div style="display: flex;flex-direction: row;justify-content: start;">
            <p style="color: gray;">评分</p><h3>{{ grade }}</h3></div>
    <div class="demo-rate-block" style="display: flex;flex-direction: column;justify-content: center; align-items: center">
      <span class="demonstration" style="width: ;">您觉得此评分</span>
      <el-rate v-model="value2" :colors="colors" style="padding-left: 30%;" />
    </div>
   <div style="margin-left: 5%;display: flex;flex-direction: row;justify-content: start;">
    <el-badge value="new" class="item">
    <el-button>点评</el-button>
  </el-badge>
  <el-badge is-dot class="item" >
    <el-button class="share-button" :icon="Share" type="primary" />
  </el-badge>
   </div>

</div>
  </template>
  
  <script lang="ts" setup>
  import { ref } from 'vue'
  import { Share } from '@element-plus/icons-vue' 
  const value1 = ref(null)
  const value2 = ref(null)
  const colors = ref(['#99A9BF', '#F7BA2A', '#FF9900'])
  import {defineProps} from "vue" 
// 通过defineProps接收父组件的值
const fatherElement = defineProps({
    // 接收传值   此处的father就是父组件的自定义名称 
    grade:{   
        type:String,  // 数据类型
        default:"未传值"  // 未传值时的默认值
    }
 })
 console.log(fatherElement.grade)  // 打印父组件的值：user

</script>

  <!-- <script>
  export default {
    data(){
      return{
        vedios:[],
      }
    },
    methods: {
      load(){
        request.get("http://localhost:9090/vedio/4").then(res=>{         
                 this.vedios=res||[];
            
        });
      },
    },
    mounted () { //这个属性就可以，在里面声明初始化时要调用的方法即可
        // we can implement any method here like
       this.load();
      }
  };
  </script> -->
  <style scoped>
  .demo-rate-block {
    padding: 30px 0;
    text-align: center;
    
    display: inline-block;

    box-sizing: border-box;
    /* padding-left: 20%; */
  }
  .demo-rate-block:last-child {
    border-right: none;
  }
  .demo-rate-block .demonstration {
    display: block;
    color: var(--el-text-color-secondary);
    font-size: 14px;
    margin-bottom: 20px;
  }
  .remark{
    margin-top: 10%;
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: start;
    border-left: solid 1px var(--el-border-color);
    padding-left: 5%;
    }

  .item {
  margin-top: 10px;
  margin-right: 40px;
}
  </style>
