<template class="flag" v-observe="'active'">
  <div class="bg-cover" v-if="showCover"></div>
    <div class="hot">
    <el-card class="box-card" v-for="(item, index) in activity" :key="index">
      <template #header>
    
          <span>
            <h3>{{item.actname}}</h3></span>    
    
      </template>
      <div>
        <img :src="item.picture" alt="" class="acphoto">
      </div>
    <div>
        <div class="clo">
        <div class="row">
        <p> <svg t="1702194441463" class="icon" viewBox="0 0 1024 1024" version="1.1" 
            xmlns="http://www.w3.org/2000/svg" p-id="4261" width="15" height="15">
            <path d="M513 267c-90.5 0-164.2 73.2-164.2 163.2 0 89.9 73.7 163.1 164.2 163.1 90.5 0 164.2-73.2 164.2-163.1 0-90-73.7-163.2-164.2-163.2z m0 267.1c-58.1 0-105.1-46.5-105.1-104S454.9 326 513 326s105.1 46.6 105.1 104.1c0 57.5-47 104-105.1 104z" fill="#cdcdcd" p-id="4262"></path><path d="M513 139.1c-173.7 0-315.1 131.9-315.1 294 0 156.5 282.3 434.3 294.3 446 5.4 5.3 12.9 8.3 20.7 8.3h0.6c8.1 0 15.7-3.5 20.9-9.2l97.8-104.5C762.1 625.2 827.9 510.6 827.9 433c0.2-162-141.2-293.9-314.9-293.9z m75.5 595l-76.2 81.5C405.5 706.7 257 524 257 433.1c0-129.5 114.8-235 256-235s256 105.4 256 235c0 35.3-23.5 121.4-180.5 301z"
             fill="#cdcdcd" p-id="4263"></path></svg>{{item.address }}</p>
        <p><svg t="1702194551099" class="icon" viewBox="0 0 1024 1024" version="1.1" 
            xmlns="http://www.w3.org/2000/svg" p-id="5523" width="15" height="15">
            <path d="M284.672 899.072c0-178.176 145.408-321.536 323.584-319.488 129.024 2.048 241.664 83.968 292.864 202.752 16.384 40.96 24.576 79.872 24.576 116.736 0 18.432 14.336 34.816 32.768 34.816h4.096c18.432 0 34.816-14.336 34.816-32.768 0-167.936-104.448-309.248-251.904-366.592 61.44-43.008 102.4-114.688 102.4-196.608 2.048-131.072-104.448-241.664-235.52-245.76-141.312-6.144-253.952 104.448-253.952 243.712 0 81.92 40.96 155.648 104.448 198.656-145.408 57.344-249.856 198.656-249.856 364.544v2.048c0 16.384 14.336 30.72 32.768 30.72h8.192c16.384 0 30.72-14.336 30.72-32.768z m147.456-534.528c-20.48-118.784 81.92-219.136 198.656-198.656 71.68 12.288 129.024 69.632 141.312 141.312 20.48 118.784-81.92 219.136-198.656 198.656-71.68-12.288-129.024-69.632-141.312-141.312z" p-id="5524" fill="#cdcdcd"></path><path d="M323.584 489.472c-65.536-14.336-112.64-71.68-112.64-141.312 0-69.632 49.152-126.976 114.688-141.312 12.288-2.048 22.528-14.336 22.528-28.672 0-18.432-18.432-32.768-36.864-28.672-92.16 20.48-161.792 102.4-161.792 200.704 0 69.632 34.816 131.072 88.064 167.936-122.88 47.104-208.896 167.936-208.896 307.2 0 10.24 0 18.432 2.048 28.672v2.048c0 16.384 14.336 30.72 30.72 30.72s30.72-14.336 30.72-30.72v-2.048c0-8.192-2.048-18.432-2.048-28.672 0-135.168 100.352-247.808 231.424-266.24 16.384-2.048 30.72-16.384 30.72-34.816-4.096-16.384-14.336-30.72-28.672-34.816z"
             p-id="5525" fill="#cdcdcd"></path></svg>{{ item.havepeople }}/{{ item.totalpeople }}</p>
    </div>
        <p><svg t="1702194633201" class="icon" viewBox="0 0 1024 1024" version="1.1"
             xmlns="http://www.w3.org/2000/svg" p-id="6688" width="10" height="10">
             <path d="M512 64c-256 0-460.8 208-460.8 460.8s208 460.8 460.8 460.8 460.8-208 460.8-460.8S768 64 512 64zM512 940.8c-227.2 0-412.8-185.6-412.8-412.8s185.6-412.8 412.8-412.8 412.8 185.6 412.8 412.8S742.4 940.8 512 940.8z" p-id="6689" fill="#bfbfbf"></path><path d="M809.6 544l-278.4 0 0-281.6c0-12.8-9.6-22.4-22.4-22.4-12.8 0-22.4 9.6-22.4 22.4l0 307.2c0 12.8 9.6 22.4 22.4 22.4 0 0 3.2 0 3.2 0l297.6 0c12.8 0 22.4-9.6 22.4-22.4C832 553.6 822.4 544 809.6 544z"
             p-id="6690" fill="#bfbfbf"></path></svg>{{ item.start_time }}</p>
        </div>
        <div class="row">
        <h5>￥{{item.charge}}/人</h5>
        <el-button type="info" plain @click="attend(item.vedio)" >参加</el-button>
    </div>
    </div>
    </el-card>
       
        <TheNewact v-show="Add" :close="close" class="add-box" :vid="vid"></TheNewact>
         <!-- <p>{{ vid }}</p> -->
        <div class="more">
          <span>创建线下活动</span> 
          <div class="divcss5"> 
            <svg t="1702296746731" class="icon" viewBox="0 0 1024 1024" version="1.1"
             xmlns="http://www.w3.org/2000/svg" p-id="4498" width="50" height="50" style="margin-top: 20%;">
             <path d="M801.171 483.589H544V226.418c0-17.673-14.327-32-32-32s-32 14.327-32 32v257.171H222.83c-17.673 0-32 14.327-32 32s14.327 32 32 32H480v257.17c0 17.673 14.327 32 32 32s32-14.327 32-32v-257.17h257.171c17.673 0 32-14.327 32-32s-14.327-32-32-32z" 
              fill="#bfbfbf" p-id="4499"></path></svg>
          </div>
          <el-button plain style="margin-top: 20%;"   @click="ne">创建</el-button>
        </div>
</div>
  </template>
  <script >
  import bus from "@/bus.js";
  import TheNewact from "@/components/Home/NewAct.vue";
  import request from "@/utils/request";
   export default {
    components:{
      TheNewact,
    },
    props: {
      activity: [],
      vid:String,
  

    },
    data() {
      return {
        usr:localStorage.getItem("usr") ? JSON.parse(localStorage.getItem("usr")):{},
        showCover:false,
        Add:false,
        people:'',
      }
    },
    methods: {
      attend(vedio){
        // bus.$on(val,function(data){
        //   this.usr=data;
        // })
        console.log(this.usr);
        if(this.usr.status==0||this.usr.status==null){
          this.$message.error("请登录");
          this.$router.push("/login");
          localStorage.removeItem("getusr");
        }
        else{      
               request.post("http://47.109.151.69:9090/activity/"+vedio).then(res=>{         
            this.$message.success("参加成功，留意消息,刷新后查看");
               });
        }
      },
      ne(){
        if(this.usr.status==0||this.usr.status==null){
          this.$message.error("请登录");
          this.$router.push("/login");
          localStorage.removeItem("getusr");
        }
        else{
          this.Add=true;
          this.showCover=true;
          document.body.style.overflow="hidden";
        }

      },
      close(){
          this.Add=false;
          this.showCover=false;
          document.body.style.overflow="auto";

      }
      
    },
  
   }
</script>
  <style scoped>
  .add-box{
    z-index: 99;
  }
  .bg-cover{
    width: 100%;
    height: 100%;
    position: fixed;
    top: 0;
    left: 0;
    background-color: rgba(0, 0, 0, .8);
    z-index: 98;
  }
  .hot{
    display: flex;
    flex-direction: row;
    justify-content: flex-start;
    margin-top: 2%;
   
  }
  .card-header {
    display: flex;
    justify-content: center;
    align-items: center;
  }
  
  .text {
    font-size: 14px;
  }
  
  .item {
    margin-bottom: 18px;
  }
  
  .box-card {
    width: 15%;
    height: 5%;
    margin-right: 3%;
    border-radius: 3%;
  }
  .acphoto{
    width: 100%;
    height: 100px;
  }
  .row{
    display: flex;
    flex-direction: row;
    justify-content: space-around;
    align-items:center;
  }
  .clo{
    display: flex;
    flex-direction: column;
    justify-content: center;
  }
  .more{
    border: 2%;
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    margin-top: 10%;
    margin-left: 5%;

  }
  .divcss5{border:2px dashed #dad9d9; 
    height:100px;
    width:100px;
    margin-top: 10%;
  }
  </style>