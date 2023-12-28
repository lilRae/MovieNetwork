<template>
    <vs-dialog class="login-dialog" auto-width not-padding v-model="active">
        <el-form class="form">
            <vs-input autocomplete="off" label-placeholder="Username" color="rgb(59,222,200)" v-model="form.username">
                <template #icon>
                    <i class="bx bx-user"></i>
                </template>
            </vs-input>

            <vs-input type="password" label-placeholder="Password" color="rgb(59,222,200)" v-model="form.password">
                <template #icon>
                    <i class="bx bx-lock-open-alt"></i>
                </template>
            </vs-input>

            <vs-button block size="large">登 录</vs-button>
        </el-form>
    </vs-dialog>
</template>

<script>
export default {
    data() {
        return {
            active: false,
        }
    },
    methods: {
        open() {
            this.active = true
        },
    }
}
</script>
