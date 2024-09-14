<template>
  <div :style='{"padding":"20px 30px 30px","margin":"0 auto","color":"#666","borderRadius":"0 0 10px 10px","background":"#fff","width":"calc(100% - 60px)","fontSize":"16px"}'>
    <el-form
	  :style='{"border":"0px solid rgba(254,169,35,.2)","padding":"30px","boxShadow":"0 0px 0px rgba(64, 158, 255, .3)","fontSize":"inherit","borderRadius":"4px","background":"none"}'
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
    >
      <div class="chat-content">
        <div v-bind:key="item.id" v-for="item in dataList">
          <div v-if="item.ask" class="left-content">
            <el-alert class="text-content" :title="item.ask" :closable="false" type="success"></el-alert>
          </div>
          <div v-else class="right-content">
            <el-alert class="text-content" :title="item.reply" :closable="false" type="warning"></el-alert>
          </div>
          <div class="clear-float"></div>
        </div>
      </div>
      <div class="clear-float"></div>
      <el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' label="回复" prop="reply">
        <el-input v-model="ruleForm.reply" placeholder="回复" clearable></el-input>
      </el-form-item>
      <el-form-item :style='{"padding":"0","margin":"30px 0 0","alignItems":"center","textAlign":"center","display":"flex","width":"100%","fontSize":"48px","justifyContent":"center"}'>
        <el-button :style='{"border":"0","cursor":"pointer","padding":"0","margin":"0 20px 0 0","outline":"none","color":"rgba(255, 255, 255, 1)","borderRadius":"4px","background":"rgba(64, 158, 255, 1)","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' type="primary" @click="onSubmit">回复</el-button>
        <el-button :style='{"border":"1px solid rgba(64, 158, 255, 1)","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"rgba(64, 158, 255, 1)","borderRadius":"4px","background":"rgba(255, 255, 255, 1)","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>
<script>
export default {
  data() {
    return {
      id: "",
      ruleForm: {},
      dataList: [],
      rules: {
        reply: [
          { required: true, message: "回复内容不能为空", trigger: "blur" }
        ]
      },
      inter:null
    };
  },
  props: ["parent"],
  methods: {
    // 初始化
    init(id) {
      this.id = id;
      var that = this;
      var inter= setInterval(function(){
        that.getList();
      },3000)
      this.inter = inter;
    },

    getList() {
      let params = {
        sort: 'addtime',
        order: 'asc',
        limit: 1000
      }
      this.$http({
        url: this.$api.chatbyuseridpage + this.id,
        method: "get",
        params: params
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.ruleForm.userid = this.id;
          this.dataList = data.data.list;
        } else {
          this.$message.error(data.msg);
        }
      });
    },
    // 提交
    onSubmit() {
      this.$refs["ruleForm"].validate(valid => {
        if (valid) {
          this.$http({
            url: this.$api.chatsave,
            method: "post",
            data: this.ruleForm
          }).then(({ data }) => {
            if (data && data.code === 0) {
              this.$message({
                message: "操作成功",
                type: "success",
                duration: 1500,
                onClose: () => {
                  this.getList();
                  this.ruleForm.reply = "";
                }
              });
            } else {
              this.$message.error(data.msg);
            }
          });
        }
      });
    },
    // 返回
    back() {
      this.parent.showFlag = false;
      this.parent.getDataList();
      if(this.inter){
        clearInterval(this.inter);
      }
    }
  }
};
</script>
<style lang="scss" scoped>
.chat-content {
  margin-left: 80px;
  padding-bottom: 60px;
  width: 500px;
  margin-bottom: 30px;
  max-height: 300px;
  height: 300px;
  overflow-y: scroll;
  border: 1px solid #eeeeee;
  .left-content {
    float: left;
    margin-bottom: 10px;
    padding: 10px;
  }
  .right-content {
    float: right;
    margin-bottom: 10px;
    padding: 10px;
  }
}
.clear-float {
  clear: both;
}
.detail-form-content {
	background-color: transparent;
}

	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  	  padding: 0 10px 0 0;
	  	  color: inherit;
	  	  font-weight: 500;
	  	  display: inline-block;
	  	  width: 150px;
	  	  font-size: inherit;
	  	  line-height: 40px;
	  	  text-align: right;
	  	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 150px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  	  border: 1px solid rgba(19,161,230,.2);
	  	  border-radius: 0px;
	  	  padding: 0 12px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: inherit;
	  	  background: #fff;
	  	  width: 400px;
	  	  font-size: 16px;
	  	  height: 44px;
	  	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  	  border: 1px solid rgba(19,161,230,.2);
	  	  border-radius: 0px;
	  	  padding: 0 10px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: inherit;
	  	  background: #fff;
	  	  width: 200px;
	  	  font-size: 16px;
	  	  height: 44px;
	  	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  	  border: 1px solid rgba(19,161,230,.2);
	  	  border-radius: 0px;
	  	  padding: 0 10px 0 30px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: inherit;
	  	  background: #fff;
	  	  width: 200px;
	  	  font-size: 16px;
	  	  height: 44px;
	  	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  	  border: 1px solid rgba(19,161,230,.2);
	  	  cursor: pointer;
	  	  border-radius: 0px;
	  	  color: inherit;
	  	  background: #fff;
	  	  object-fit: cover;
	  	  width: 180px;
	  	  font-size: 32px;
	  	  line-height: 90px;
	  	  text-align: center;
	  	  height: 90px;
	  	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  	  border: 1px solid rgba(19,161,230,.2);
	  	  cursor: pointer;
	  	  border-radius: 0px;
	  	  color: inherit;
	  	  background: #fff;
	  	  object-fit: cover;
	  	  width: 180px;
	  	  font-size: 32px;
	  	  line-height: 90px;
	  	  text-align: center;
	  	  height: 90px;
	  	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  	  border: 1px solid rgba(19,161,230,.2);
	  	  cursor: pointer;
	  	  border-radius: 0px;
	  	  color: inherit;
	  	  background: #fff;
	  	  object-fit: cover;
	  	  width: 180px;
	  	  font-size: 32px;
	  	  line-height: 90px;
	  	  text-align: center;
	  	  height: 90px;
	  	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  	  border: 1px solid rgba(19,161,230,.2);
	  	  border-radius: 0px;
	  	  padding: 12px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: inherit;
	  	  background: #fff;
	  	  width: 500px;
	  	  font-size: 16px;
	  	  height: 140px;
	  	}
</style>
