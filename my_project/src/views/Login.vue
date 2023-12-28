<template>
    <div class="container">
        <div class="topp"> 欢迎来到home for movie ,登录获得更多功能...</div>
      <div class="main">
          <!-- 整个注册盒子 -->
        <div class="loginbox">
            <!-- you侧的注册盒子 -->
           
   
          <!-- zuo侧的注册盒子 -->
           <div class="background">
              <div class="title">Find a partner through movies, books, music</div>
          </div>
          <div class="loginbox-in">
            <span  style="margin-top: 30px; color: rgb(95, 95, 95);" class="title">login</span>
            <div class="userbox"> 
             <!-- <span class="iconfont">&#xe817;</span>  -->
             <svg t="1702912799433" class="icon" viewBox="0 0 1024 1024" version="1.1" 
             xmlns="http://www.w3.org/2000/svg" p-id="4396" width="20" height="20">
             <path d="M512 535.278933c-97.553067 0-176.64-79.872-176.64-178.414933
              0-98.542933 79.086933-178.449067 176.64-178.449067 97.553067 0 176.64 79.872 176.64 178.449067 0 98.5088-79.086933 178.414933-176.64 178.414933z m0-46.557866c72.0896 0 130.56-59.050667 130.56-131.857067 0-72.840533-58.4704-131.8912-130.56-131.8912s-130.56 59.050667-130.56 131.8912c0 72.8064 58.4704 131.857067 130.56 131.857067z m0 356.864c-111.342933 0-156.0576-1.9456-200.465067-11.844267-63.453867-14.1312-99.054933-45.806933-99.054933-100.078933 0-104.482133 135.7824-182.8864 299.52-182.8864 163.7376 0 299.52 78.404267 299.52 182.8864 0 54.272-35.601067 85.947733-99.054933 100.078933-44.407467 9.898667-89.122133 11.844267-200.465067 11.844267z m0-46.557867c196.5056 0 253.44-12.6976 253.44-65.365333 0-71.816533-111.786667-136.328533-253.44-136.328534s-253.44 64.512-253.44 136.328534c0 52.667733 56.9344 65.365333 253.44 65.365333z"
                 fill="#cdcdcd" p-id="4397"></path></svg>
             <input  class="user" id="user"  v-model="usr.usrname" placeholder="Name/admin">
             </div>
            <br>
            <div class="pwdbox">
                <svg t="1702912903411" class="icon" viewBox="0 0 1024 1024" version="1.1" 
                xmlns="http://www.w3.org/2000/svg" p-id="4240" width="20" height="20">
                <path d="M288 384v-74.666667c0-123.722667 100.266667-224 224-224s224 100.224 224 224v74.666667h10.677333C811.445333 384 864 436.597333 864 501.333333v320c0 64.821333-52.469333 117.333333-117.322667 117.333334H277.333333C212.554667 938.666667 160 886.069333 160 821.333333V501.333333c0-64.821333 52.469333-117.333333 117.322667-117.333333H288z m64 0h320v-74.666667c0-88.426667-71.605333-160-160-160-88.384 0-160 71.626667-160 160v74.666667zM224 501.333333v320c0 29.397333 23.914667 53.333333 53.322667 53.333334H746.666667A53.269333 53.269333 0 0 0 800 821.333333V501.333333c0-29.397333-23.914667-53.333333-53.322667-53.333333H277.333333A53.269333 53.269333 0 0 0 224 501.333333z" 
                    fill="#cdcdcd" p-id="4241"></path></svg>
              <!-- <span class="iconfont">&#xe775;</span> -->
             <input  class="pwd"  id="password" v-model="usr.password" type="password"  placeholder="Password/1234567">
             </div> 
            <br> 
            <button class="login_btn" autocomplete="off" @click="login"> 登录</button>
             <br>

       </div>
            
        </div>
        <a @click="undo" class="undo">不想登录？继续访问</a>
      </div>
    </div>
  </template>
  <script>
  import request from "@/utils/request";
export default{
    data() {
        return {
            usr:{},
        }
    },
    methods:{

        login(){
            if(this.usr.usrname==null){
                this.$message.error("输入有效用户名");
            }
            else if(this.usr.password==null){
                this.$message.error("输入有效密码");
            }
            else{ 
            request.post("http://47.109.151.69:9090/usr/login",this.usr).then(res=>{         
               if(res.code=='200'){
                res.data.status=1;
                console.log(res.data);
                localStorage.setItem("usr",JSON.stringify(res.data)); //存储信息到浏览器
                this.$router.push("/home");
                this.$message.success("登录成功");
               }
            else{
                this.$message.error("用户名或密码错误");
            }});
        }
    },
    undo(){
        this.$router.push("/home");
    } 
    }
}</script>
<style scoped>
.undo{
    position: absolute;
    top:65%;
    left: 57%;
    font-size: 13px;
    cursor: pointer;
}

.topp{
    position:absolute;
    left:34%;
    top:14%;
    font-size:13px;
    color:#8b8a8a;
    
}
.loginbox{
    position:absolute;
    width:500px;
    height:300px;
    top:40%;
    left:50%;
    transform:translate(-50%,-50%);
}
input:-webkit-autofill {
  /* 修改默认背景框的颜色 */
 box-shadow: 0 0 0px 1000px  #eef9f5 inset !important;
 /* 修改默认字体的颜色 */
 -webkit-text-fill-color: #e5ebe8;
} 

input:-webkit-autofill::first-line {
  /* 修改默认字体的大小 */
 font-size: 15px;
 /* 修改默认字体的样式 */
 font-weight:bold;
 }
 .loginbox{
    display:flex;
    position:absolute;
    width:500px;
    height:300px;
    top:40%;
    left:50%;
    transform:translate(-50%,-50%);
    box-shadow: 0 12px 16px 0  rgba(172, 170, 170, 0.219), 0 17px 50px 0 #dbdbdb;
}
.loginbox-in{
     background-color:#dde0ddd1;
     width:200px;
     display:flex;
     flex-direction: column;
    align-items: center;
    justify-content: center;
}
.userbox{
    height:30px;
     width:200px;
     display: flex;
     margin-left:25px;
     margin-top: 40px;
}
.pwdbox{ 
    height:30px;
    width:200px;
    display: flex;
    margin-left:25px;
}

.background{
    width:570px;
    height: 300px;
    background-image:url('../components/Home/img/cq6.jpg');
    opacity: calc(0.7);
    background-size:cover;
    font-family:sans-serif;
}
.title{
    margin-top:220px;
    font-weight:bold;
    font-size:20px;
    color:#f5f2f2;
    
}
.title:hover{
     font-size:21px;
     transition: all 0.4s ease-in-out;
     cursor: pointer;
}
.uesr-text{
     position:left;
}
input{
    outline-style: none ;
    border: 0;
    width: 150px;
    border-bottom:1px solid #9b9a9a;
    background-color:transparent;
    height:20px;
     font-family:sans-serif;
    font-size:12px;
    color:#767676;
    /* font-weight:bold; */
}
 /* input::-webkit-input-placeholder{
    color:#E9E9E9;
 } */
input:focus{
    border-bottom:2px solid #445b53;
    background-color:transparent;
     transition: all 0.2s ease-in;
     font-family:sans-serif;
    font-size:13px;
     color:#485651;
     font-weight:bold;
     
}
input:hover{
    border-bottom:2px solid #d7d7d7;
    background-color:transparent;
     transition: all 0.2s ease-in;
     font-family:sans-serif;
    font-size:13px;
     color:#5f5f5f;
     font-weight:bold;
     
}
 
input:-webkit-autofill {
  /* 修改默认背景框的颜色 */
 box-shadow: 0 0 0px 1000px  #89AB9E inset !important;
 /* 修改默认字体的颜色 */
 -webkit-text-fill-color: #8b8e8d;
} 

input:-webkit-autofill::first-line {
  /* 修改默认字体的大小 */
 font-size: 15px;
 /* 修改默认字体的样式 */
 font-weight:bold;
 }
.log-box{
    font-size:12px;
    display: flex;
    justify-content: space-between ;
    width:190px;
    margin-left:30px;
    color:#4E655D;
    margin-top:-5px;
    align-items: center;
   
}
.log-box-text{
    color:#4E655D;
    font-size:12px;
      text-decoration:underline;
    }
.login_btn{
    background-color: #a2b4ad; /* Green */
    border: none;
    color: #FAFAFA;
    padding: 5px 22px;
    text-align: center;
    text-decoration: none;
    font-size: 13px;
    border-radius: 20px;
    outline:none;
}
.login_btn:hover{
    box-shadow: 0 12px 16px 0 rgba(138, 131, 131, 0.24), 0 17px 50px 0 rgba(0,0,0,0.19);
    cursor: pointer;
     background-color: #97a39e;
      transition: all 0.2s ease-in;
}

.warn{
    margin-top:60px;
    /* margin-right:120px; */
    margin-left:-120px;
    margin-bottom: 5px;
     font-weight:bold;
    font-size:17px;
}

.register_btn{
    background-color: transparent; /* Green */
    border: none;
    text-decoration: none;
    font-size: 12px;
    /* border-radius: 20px;   */
     color:#4E655D;
    font-size:12px;
    text-decoration:underline;
    display: flex;
    margin-left:25px;
    outline:none;
    
}
.register_btn:hover{
    font-weight:bold;
    cursor: pointer;
}


/* .iconfont {
    font-family: "iconfont" !important;
    font-size: 20px;
    font-style: normal;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    height:22px;
    color:#4E655D;
    margin-right:10px;
    margin-top:3px;
} */

/* .icon-key:before {
    content: "\e775";
}

.icon-account:before {
    content: "\e817";
} */
</style>