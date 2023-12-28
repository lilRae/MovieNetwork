<template >  
    <div class="new">
        <div class="title"> 
            <h3 style="margin-right: 35%;">申请活动</h3>
            <div @click="childclose">
            <svg t="1703255057022" class="icon" viewBox="0 0 1024 1024" version="1.1" 
            xmlns="http://www.w3.org/2000/svg" p-id="4214" width="20" height="20">
            <path d="M512 960c-247.039484 0-448-200.960516-448-448S264.960516 64 512 64 960 264.960516 960 512 759.039484 960 512 960zM512 128.287273c-211.584464 0-383.712727 172.128262-383.712727 383.712727 0 211.551781 172.128262 383.712727 383.712727 383.712727 211.551781 0 383.712727-172.159226 383.712727-383.712727C895.712727 300.415536 723.551781 128.287273 512 128.287273z" fill="#bfbfbf" p-id="4215"></path><path d="M557.05545 513.376159l138.367639-136.864185c12.576374-12.416396 12.672705-32.671738 0.25631-45.248112s-32.704421-12.672705-45.248112-0.25631l-138.560301 137.024163-136.447897-136.864185c-12.512727-12.512727-32.735385-12.576374-45.248112-0.063647-12.512727 12.480043-12.54369 32.735385-0.063647 45.248112l136.255235 136.671523-137.376804 135.904314c-12.576374 12.447359-12.672705 32.671738-0.25631 45.248112 6.271845 6.335493 14.496116 9.504099 22.751351 9.504099 8.12794 0 16.25588-3.103239 22.496761-9.247789l137.567746-136.064292 138.687596 139.136568c6.240882 6.271845 14.432469 9.407768 22.65674 9.407768 8.191587 0 16.352211-3.135923 22.591372-9.34412 12.512727-12.480043 12.54369-32.704421 0.063647-45.248112L557.05545 513.376159z"
             fill="#bfbfbf" p-id="4216"></path></svg></div></div>
    <div class="la">
    <el-form ref="form" :model="form"  label-width="80px">
      <el-form-item label="活动名称">
        <el-input v-model="form.actname" />
      </el-form-item>
      <el-form-item label="地点">
        <el-input v-model="form.address" />
      </el-form-item>
      <el-form-item label="时间">
        <el-col :span="11">
          <el-date-picker
      v-model="form.start_time"
      type="datetime"
      format="YYYY/MM/DD HH:mm:ss"
      placeholder="选择日期时间">
    </el-date-picker>
        </el-col>
      </el-form-item>
        <el-form-item label="价格">
            <el-input-number v-model="form.charge" @change="handleChange" :min="1" :max="1000" label="描述文字"></el-input-number>
      </el-form-item>
      <el-form-item label="最大人数">
            <el-input-number v-model="form.totalpeople" @change="handleChange" :min="1" :max="1000" label="描述文字"></el-input-number>
      </el-form-item>
      <el-form-item label="介绍">
        <el-input v-model="form.text" type="textarea" />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="onSubmit">提交申请</el-button>
        <el-button style="margin-left: 35%;" @click="childclose">取消</el-button>
      </el-form-item>
     
    </el-form>
</div>
</div>

  </template>
  
  <script>
  import request from "@/utils/request";
 
  export default {
    props:{
        close: {
            type:Function
        },
        Add:{
            type:String
        },
        vid:{
            type:String
        }
    },
    data() {
        return {
          form: {
          actname: '',
          address: '',
          start_time: '',
          charge: '',
          totalpeople: '',
          text: '',
          vedio:'',
          havepeople:'',
          
        }
        }
    },
    methods: {
        childclose() {
                this.close();
            },
            onSubmit(){
            this.form.vedio=this.vid;
           this.form.havepeople=0;

            request.post("http://47.109.151.69:9090/activity",JSON.parse(JSON.stringify(this.form))).then(res=>{         
               if(res=true){ this.$message.success("申请成功"); 
               this.close();}
              else {this.$message.error("申请失败");
                 this.close();}
            });
    },
  } 
  }
  </script>
  <style scoped>
  
  .new{
    width: 30%;
    border:1px solid #f0eeee;
    border-radius: 3%;
    border-color: rgb(199, 197, 197);
    background-color: #f0eeee;
    position: absolute;
    top: 15%;
    left: 36%;
  }
  .title{
    border: 0%;
    border-bottom: 6px solid #e6e6e6b8;
    display: flex;
    flex-direction: row;
    justify-content: flex-end;
  }
  .la{
    width: 80%;
    margin-top: 5%;
    margin-left: 8%;
  }
</style>