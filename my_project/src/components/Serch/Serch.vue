<template>
  <div id="app-cover">
    <div id="app" :class="{ 'opened': isClicked }">
      <form method="get" action="">
        <div id="f-element">
          <div id="inp-cover">
            <input v-model="query" ref="inputRef" type="text" :class="{ 'move-up': isClicked }" name="query" placeholder="查询电影/书籍/音乐/活动" autocomplete="off">
          </div>
        </div>
        <button @click="toggleApp" type="submit" :class="{ 'shadow': isClicked }"><i class="fas fa-search"></i></button>
      </form>
    </div>
    <div id="layer" @click="toggleApp" :class="{ 'sl': isClicked }" title="Click the blue area to hide the form"></div>
    <div id="init" @click="toggleApp"> <svg t="1703668395491" class="icon" viewBox="0 0 1024 1024" 
      version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="4294" width="32" height="32" style="margin-top: 30%;">
      <path d="M966.4 924.8l-230.4-227.2c60.8-67.2 96-156.8 96-256 0-217.6-176-390.4-390.4-390.4-217.6 0-390.4 176-390.4 390.4 0 217.6 176 390.4 390.4 390.4 99.2 0 188.8-35.2 256-96l230.4 227.2c9.6 9.6 28.8 9.6 38.4 0C979.2 950.4 979.2 934.4 966.4 924.8zM102.4 441.6c0-185.6 150.4-339.2 339.2-339.2s339.2 150.4 339.2 339.2c0 89.6-35.2 172.8-92.8 233.6-3.2 0-3.2 3.2-6.4 3.2-3.2 3.2-3.2 3.2-3.2 6.4-60.8 57.6-144 92.8-233.6 92.8C256 780.8 102.4 627.2 102.4 441.6z" 
      p-id="4295" fill="#ffffff"></path></svg></div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      query: '',
      isClicked: false,
    };
  },
  methods: {
    toggleApp() {
      this.isClicked = !this.isClicked;
      if (this.isClicked) {
      this.$nextTick(() => {
        this.$refs.inputRef.focus();
      });
    }
    },
  },
};
</script>

<style scoped>
* {
  outline: none;
}

html,
body {
  height: 100%;
  min-height: 100%;
}

body {
  margin: 0;
}

body, input {
  cursor: url(http://k003.kiwi6.com/hotlink/vp054ir5gt/c1.png) 32 32, auto;
  cursor: -webkit-image-set(url(http://k003.kiwi6.com/hotlink/vp054ir5gt/c1.png) 1x,url(http://k003.kiwi6.com/hotlink/z6fy599487/c2.png) 2x) 32 32, auto;
}

body:active, input:active {
  cursor: url(http://k003.kiwi6.com/hotlink/3p6w4icbzt/c1a.png) 32 32, auto;
  cursor: -webkit-image-set(url(http://k003.kiwi6.com/hotlink/3p6w4icbzt/c1a.png) 1x,url(http://k003.kiwi6.com/hotlink/6ma7828al1/c2a.png) 2x) 32 32, auto;
}

#app-cover {
  position: absolute;
  top: 50%;
  right: 0;
  left: 0;
  width: 434px;
  margin: -41px auto 0 auto;
}

#app {
  position: relative;
  width: 82px;
  height: 82px;
  border-radius: 120px;
  margin: 0 auto;
  transition: 0.5s ease width;
  z-index: 2;
}

form {
  position: relative;
  height: 82px;
  cursor: auto;
  border-radius: 120px;
}

#f-element {
  position: absolute;
  top: 0;
  right: 0;
  bottom: 0;
  left: 0;
  overflow: hidden;
  border-radius: 120px;
}

#inp-cover {
  position: absolute;
  top: 0;
  right: 41px;
  bottom: 0;
  left: 0;
  padding: 0 35px;
  background-color: #fff;
}

input {
  display: block;
  width: 100%;
  font-size: 19px;
  font-family: Arial, Helvetica, sans-serif;
  color: #b2d4bc;
  border: 0;
  padding: 30px 0;
  margin: 0;
  margin-top: 52px;
  line-height: 1;
  background-color: transparent;
  transition: 0.15s ease margin-top;
  cursor: auto;
}

button {
  position: absolute;
  top: 0;
  right: 0;
  width: 82px;
  height: 82px;
  color: #fff;
  font-size: 30px;
  line-height: 1;
  padding: 26px;
  margin: 0;
  border: 0;
  background-color: #dce3d7;
  transition: 0.3s ease background-color;
  border-radius: 50%;
}

button.shadow {
  box-shadow: 0 10px 30px #f2f3f2;
}

button i.fas {
  display: block;
  line-height: 1;
}

#layer {
  width: 80px;
  height: 80px;
  border-radius: 50%;
  background-color: #dce3d7;
  transition: 0.9s ease all;
  z-index: 1;
}

#layer.sl {
  transition: 0.3s ease all;
}

#layer,
#init {
  position: fixed;
  top: 50%;
  margin: -40px auto 0 auto;
}

#layer {
  right: -100px;
  left: -100px;
}

#init {
  right: 0;
  left: 0;
  width: 82px;
  height: 82px;
  cursor: pointer;
  z-index: 2;
}

#app.opened {
  width: 434px;
  box-shadow: 0 10px 30px#ccd2c8;
}

.opened input.move-up {
  margin-top: 0;
}

.opened button {
  color: #dce3d7;
  background-color: #dce3d7;
  box-shadow: 0 10px 30px #727372;
}

.opened input.move-up {
  margin-top: 0;
}

.opened button {
  color: #b2d4bc;
  background-color: #fff;
  box-shadow: none;
  cursor: pointer;
}

#app.opened + #layer {
  width: 4000px;
  height: 4000px;
  margin-top: -2000px;
  opacity: 1;
  z-index: 0;
}

#app.opened ~ #init {
  z-index: -1;
}

</style>