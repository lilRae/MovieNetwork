<template>
    <div>
        <el-col :span="6">
        <div>
          <el-statistic title="文件上转量">
            <template slot="formatter">
               <i class="el-icon-folder-opened"></i>
                   50/100
             
              <el-progress type="circle" :percentage="50" class="sumprogress"></el-progress>
            </template>
          </el-statistic>
        </div>
      </el-col> 
    </div>
</template>
<style>
.sumprogress{
    margin-top: 10%;
}</style>