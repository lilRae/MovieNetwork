
<template>
    <div>
        <div id="box">
    <ul id="con1" ref="con1" :class="{anim:animate==true}">
        <li v-for='item in remarks'>{{item.remark}}</li>
    </ul>
</div> 
    </div>
</template>
<script>
export default {
    props: {
      remarks: [],
      required: true
    },
    data() {
      return {
          animate:false,
      }
    },
    created(){
        setInterval(this.scroll,1500)
    },
    methods: {
        scroll(){
           this.animate=true;    // 因为在消息向上滚动的时候需要添加css3过渡动画，所以这里需要设置true
           setTimeout(()=>{      //  这里直接使用了es6的箭头函数，省去了处理this指向偏移问题，代码也比之前简化了很多
                   this.remarks.push(this.remarks[0]);  // 将数组的第一个元素添加到数组的
                   this.remarks.shift();               //删除数组的第一个元素
                   this.animate=false;  // margin-top 为0 的时候取消过渡动画，实现无缝滚动
           },500)
        }
    },

  }
</script>
<style scoped>#box{
    /* width: 300px;
    height: 32px; */
    width: 80%;
    height: 50px;
    overflow: hidden;
    margin-top: 5%;
    /* margin: 200px auto;
    padding-left: 30px; */
    
    border: 0px solid black;
}
.anim{
    transition: all 2s;
    margin-top: -50px;
}
#con1 li{
    list-style: none;
    line-height: 30px;
    height: 30px;
    color: rgb(179, 181, 183);
}
</style>