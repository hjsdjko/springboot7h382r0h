<template>
  <div :style='{"padding":"20px 30px 30px","margin":"0 auto","color":"#666","borderRadius":"0 0 10px 10px","background":"#fff","width":"calc(100% - 60px)","fontSize":"16px"}'>
    <el-form
	  :style='{"border":"0px solid rgba(254,169,35,.2)","padding":"30px","boxShadow":"0 0px 0px rgba(64, 158, 255, .3)","fontSize":"inherit","borderRadius":"4px","background":"none"}'
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      label-width="150px"
    >  
     <el-row>
        <el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}'   v-if="flag=='jiazhang'"  label="家长账号" prop="jiazhangzhanghao">
          <el-input v-model="ruleForm.jiazhangzhanghao" readonly              placeholder="家长账号" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}'   v-if="flag=='jiazhang'"  label="家长姓名" prop="jiazhangxingming">
          <el-input v-model="ruleForm.jiazhangxingming"               placeholder="家长姓名" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}'   v-if="flag=='jiazhang'"  label="学生姓名" prop="xueshengxingming">
          <el-input v-model="ruleForm.xueshengxingming"               placeholder="学生姓名" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-if="flag=='jiazhang'"  label="学生性别" prop="xueshengxingbie">
          <el-select v-model="ruleForm.xueshengxingbie"  placeholder="请选择学生性别">
            <el-option
                v-for="(item,index) in jiazhangxueshengxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}'   v-if="flag=='jiazhang'"  label="年龄" prop="nianling">
          <el-input v-model="ruleForm.nianling"               placeholder="年龄" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-if="flag=='jiazhang'"  label="年级" prop="nianji">
          <el-select v-model="ruleForm.nianji"  placeholder="请选择年级">
            <el-option
                v-for="(item,index) in jiazhangnianjiOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}'   v-if="flag=='jiazhang'"  label="手机" prop="shouji">
          <el-input v-model="ruleForm.shouji"               placeholder="手机" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-if="flag=='jiazhang'" label="头像" prop="touxiang">
          <file-upload
          tip="点击上传头像"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
          @change="jiazhangtouxiangUploadChange"
          ></file-upload>
        </el-form-item>
        <el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}'   v-if="flag=='huodongzuzhizhe'"  label="账号" prop="zhanghao">
          <el-input v-model="ruleForm.zhanghao" readonly              placeholder="账号" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}'   v-if="flag=='huodongzuzhizhe'"  label="姓名" prop="xingming">
          <el-input v-model="ruleForm.xingming"               placeholder="姓名" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-if="flag=='huodongzuzhizhe'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie"  placeholder="请选择性别">
            <el-option
                v-for="(item,index) in huodongzuzhizhexingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}'   v-if="flag=='huodongzuzhizhe'"  label="年龄" prop="nianling">
          <el-input v-model="ruleForm.nianling"               placeholder="年龄" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}'   v-if="flag=='huodongzuzhizhe'"  label="联系方式" prop="lianxifangshi">
          <el-input v-model="ruleForm.lianxifangshi"               placeholder="联系方式" clearable></el-input>
        </el-form-item>
        <el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-if="flag=='huodongzuzhizhe'" label="头像" prop="touxiang">
          <file-upload
          tip="点击上传头像"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
          @change="huodongzuzhizhetouxiangUploadChange"
          ></file-upload>
        </el-form-item>
		<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-if="flag=='users'" label="用户名" prop="username">
			<el-input v-model="ruleForm.username" placeholder="用户名"></el-input>
		</el-form-item>
		<el-form-item :style='{"padding":"0","margin":"30px 0 0","alignItems":"center","textAlign":"center","display":"flex","width":"100%","fontSize":"48px","justifyContent":"center"}'>
			<el-button class="btn3" :style='{"border":"1px solid rgba(19,161,230,.2)","cursor":"pointer","padding":"0 20px","margin":"0px 4px","outline":"none","color":"rgba(19,161,230,.8)","borderRadius":"4px","background":"rgba(255,255,255,1)","width":"auto","fontSize":"16px","lineHeight":"24px","height":"40px"}' type="primary" @click="onUpdateHandler">
				<span class="icon iconfont icon-tijiao16" :style='{"color":"inherit","margin":"0 2px","fontSize":"18px"}'></span>
				保存
			</el-button>
		</el-form-item>
      </el-row>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isMobile,isPhone,isURL,checkIdCard } from "@/utils/validate";

export default {
  data() {
    return {
      ruleForm: {},
      flag: '',
      usersFlag: false,
      jiazhangxueshengxingbieOptions: [],
      jiazhangnianjiOptions: [],
      jiazhangvipOptions: [],
      huodongzuzhizhexingbieOptions: [],
    };
  },
  mounted() {
    var table = this.$storage.get("sessionTable");
    this.flag = table;
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.ruleForm = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
    this.jiazhangxueshengxingbieOptions = "男,女".split(',')
    this.jiazhangnianjiOptions = "一年级,二年级,三年级,四年级,五年级,六年级".split(',')
    this.jiazhangvipOptions = "是,否".split(',')
    this.huodongzuzhizhexingbieOptions = "男,女".split(',')
  },
  methods: {
    jiazhangtouxiangUploadChange(fileUrls) {
        this.ruleForm.touxiang = fileUrls;
    },
    huodongzuzhizhetouxiangUploadChange(fileUrls) {
        this.ruleForm.touxiang = fileUrls;
    },
    onUpdateHandler() {
      if((!this.ruleForm.jiazhangzhanghao)&& 'jiazhang'==this.flag){
        this.$message.error('家长账号不能为空');
        return
      }


      if((!this.ruleForm.jiazhangxingming)&& 'jiazhang'==this.flag){
        this.$message.error('家长姓名不能为空');
        return
      }


      if((!this.ruleForm.mima)&& 'jiazhang'==this.flag){
        this.$message.error('密码不能为空');
        return
      }

        if(this.ruleForm.mima && (this.ruleForm.mima.length<2) && `jiazhang` == this.flag){
            this.$message.error(`密码长度不能小于2`);
            return
        }

        if(this.ruleForm.mima && (this.ruleForm.mima.length>10) && `jiazhang` == this.flag){
            this.$message.error(`密码长度不能大于10`);
            return
        }






      if( 'jiazhang' ==this.flag && this.ruleForm.nianling&&(!isIntNumer(this.ruleForm.nianling))){
       this.$message.error(`年龄应输入整数`);
        return
      }




      if( 'jiazhang' ==this.flag && this.ruleForm.shouji&&(!isMobile(this.ruleForm.shouji))){
        this.$message.error(`手机应输入手机格式`);
        return
      }


        if(this.ruleForm.touxiang!=null) {
                this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url,"g"),"");
        }


      if((!this.ruleForm.zhanghao)&& 'huodongzuzhizhe'==this.flag){
        this.$message.error('账号不能为空');
        return
      }


      if((!this.ruleForm.xingming)&& 'huodongzuzhizhe'==this.flag){
        this.$message.error('姓名不能为空');
        return
      }


      if((!this.ruleForm.mima)&& 'huodongzuzhizhe'==this.flag){
        this.$message.error('密码不能为空');
        return
      }

        if(this.ruleForm.mima && (this.ruleForm.mima.length<2) && `huodongzuzhizhe` == this.flag){
            this.$message.error(`密码长度不能小于2`);
            return
        }

        if(this.ruleForm.mima && (this.ruleForm.mima.length>10) && `huodongzuzhizhe` == this.flag){
            this.$message.error(`密码长度不能大于10`);
            return
        }




      if( 'huodongzuzhizhe' ==this.flag && this.ruleForm.nianling&&(!isIntNumer(this.ruleForm.nianling))){
       this.$message.error(`年龄应输入整数`);
        return
      }


      if( 'huodongzuzhizhe' ==this.flag && this.ruleForm.lianxifangshi&&(!isMobile(this.ruleForm.lianxifangshi))){
        this.$message.error(`联系方式应输入手机格式`);
        return
      }


        if(this.ruleForm.touxiang!=null) {
                this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url,"g"),"");
        }
      if('users'==this.flag && this.ruleForm.username.trim().length<1) {
	this.$message.error(`用户名不能为空`);
        return	
      }
      this.$http({
        url: `${this.$storage.get("sessionTable")}/update`,
        method: "post",
        data: this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "修改信息成功",
            type: "success",
            duration: 1500,
            onClose: () => {
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
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
	
	.add-update-preview .btn3 {
				border: 1px solid rgba(19,161,230,.2);
				cursor: pointer;
				border-radius: 4px;
				padding: 0 20px;
				margin: 0px 4px;
				outline: none;
				color: rgba(19,161,230,.8);
				background: rgba(255,255,255,1);
				width: auto;
				font-size: 16px;
				line-height: 24px;
				height: 40px;
			}
	
	.add-update-preview .btn3:hover {
				border: 1px solid #999;
				color: #333;
				background: #fff;
				opacity: 0.8;
			}
	
	.editor>.avatar-uploader {
		line-height: 0;
		height: 0;
	}
</style>
