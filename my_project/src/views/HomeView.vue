<template>
  <div class="home">
    <the-home></the-home>
  </div>
</template>

<script lang="ts">
import { Options, Vue } from "vue-class-component";
import TheHome from "@/components/Home/Home.vue"; // @ is an alias to /src

@Options({
  components: {
   TheHome,
  },
})
export default class HomeView extends Vue {}
</script>
