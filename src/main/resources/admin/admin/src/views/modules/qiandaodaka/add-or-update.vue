<template>
	<div class="addEdit-block" :style='{"padding":"20px 30px 30px","margin":"0 auto","color":"#666","borderRadius":"0 0 10px 10px","background":"#fff","width":"calc(100% - 60px)","fontSize":"16px"}'>
		<el-form
			:style='{"border":"0px solid rgba(254,169,35,.2)","padding":"30px","boxShadow":"0 0px 0px rgba(64, 158, 255, .3)","fontSize":"inherit","borderRadius":"4px","background":"none"}'
			class="add-update-preview"
			ref="ruleForm"
			:model="ruleForm"
			:rules="rules"
			label-width="150px"
		>
			<template >
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="签到名称" prop="qiandaomingcheng">
					<el-input  v-model="ruleForm.qiandaomingcheng" placeholder="签到名称" clearable  :readonly="ro.qiandaomingcheng"></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="签到名称" prop="qiandaomingcheng">
					<el-input v-model="ruleForm.qiandaomingcheng" placeholder="签到名称" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="签到日期" prop="qiandaoriqi">
					<el-input  v-model="ruleForm.qiandaoriqi" placeholder="签到日期" clearable  :readonly="ro.qiandaoriqi"></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="签到日期" prop="qiandaoriqi">
					<el-input v-model="ruleForm.qiandaoriqi" placeholder="签到日期" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="date" v-if="type!='info'" label="签到时间" prop="qiandaoshijian">
					<el-date-picker
						value-format="yyyy-MM-dd HH:mm:ss"
						v-model="ruleForm.qiandaoshijian" 
						type="datetime"
						:readonly="ro.qiandaoshijian"
						placeholder="签到时间"
					></el-date-picker>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-else-if="ruleForm.qiandaoshijian" label="签到时间" prop="qiandaoshijian">
					<el-input v-model="ruleForm.qiandaoshijian" placeholder="签到时间" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="家长账号" prop="jiazhangzhanghao">
					<el-input  v-model="ruleForm.jiazhangzhanghao" placeholder="家长账号" clearable  :readonly="ro.jiazhangzhanghao"></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="家长账号" prop="jiazhangzhanghao">
					<el-input v-model="ruleForm.jiazhangzhanghao" placeholder="家长账号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="家长姓名" prop="jiazhangxingming">
					<el-input  v-model="ruleForm.jiazhangxingming" placeholder="家长姓名" clearable  :readonly="ro.jiazhangxingming"></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="家长姓名" prop="jiazhangxingming">
					<el-input v-model="ruleForm.jiazhangxingming" placeholder="家长姓名" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="学生姓名" prop="xueshengxingming">
					<el-input  v-model="ruleForm.xueshengxingming" placeholder="学生姓名" clearable  :readonly="ro.xueshengxingming"></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="学生姓名" prop="xueshengxingming">
					<el-input v-model="ruleForm.xueshengxingming" placeholder="学生姓名" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="学生性别" prop="xueshengxingbie">
					<el-input  v-model="ruleForm.xueshengxingbie" placeholder="学生性别" clearable  :readonly="ro.xueshengxingbie"></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="学生性别" prop="xueshengxingbie">
					<el-input v-model="ruleForm.xueshengxingbie" placeholder="学生性别" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="年龄" prop="nianling">
					<el-input  v-model="ruleForm.nianling" placeholder="年龄" clearable  :readonly="ro.nianling"></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="年龄" prop="nianling">
					<el-input v-model="ruleForm.nianling" placeholder="年龄" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="年级" prop="nianji">
					<el-input  v-model="ruleForm.nianji" placeholder="年级" clearable  :readonly="ro.nianji"></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="年级" prop="nianji">
					<el-input v-model="ruleForm.nianji" placeholder="年级" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="input" v-if="type!='info'"  label="手机" prop="shouji">
					<el-input  v-model="ruleForm.shouji" placeholder="手机" clearable  :readonly="ro.shouji"></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' v-else class="input" label="手机" prop="shouji">
					<el-input v-model="ruleForm.shouji" placeholder="手机" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="upload" v-if="type!='info' && !ro.touxiang" label="头像" prop="touxiang">
					<file-upload
						tip="点击上传头像"
						action="file/upload"
						:limit="3"
						:multiple="true"
						:fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
						@change="touxiangUploadChange"
					></file-upload>
				</el-form-item>
				<el-form-item :style='{"color":"inherit","margin":"0 0 20px 0","fontSize":"inherit"}' class="upload" v-else-if="ruleForm.touxiang" label="头像" prop="touxiang">
					<img v-if="ruleForm.touxiang.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.touxiang.split(',')[0]" width="100" height="100">
					<img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.touxiang.split(',')" :src="$base.url+item" width="100" height="100">
				</el-form-item>
			</template>
			<el-form-item :style='{"padding":"0","margin":"30px 0 0","alignItems":"center","textAlign":"center","display":"flex","width":"100%","fontSize":"48px","justifyContent":"center"}' class="btn">
				<el-button class="btn3"  v-if="type!='info'" type="success" @click="onSubmit">
					<span class="icon iconfont icon-tijiao16" :style='{"color":"inherit","margin":"0 2px","fontSize":"18px"}'></span>
					保存
				</el-button>
				<el-button class="btn4" v-if="type!='info'" type="success" @click="back()">
					<span class="icon iconfont icon-quxiao09" :style='{"color":"inherit","margin":"0 2px","fontSize":"18px"}'></span>
					取消
				</el-button>
				<el-button class="btn5" v-if="type=='info'" type="success" @click="back()">
					<span class="icon iconfont icon-fanhui01" :style='{"color":"inherit","margin":"0 2px","fontSize":"18px"}'></span>
					返回
				</el-button>
			</el-form-item>
		</el-form>
    

  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
	data() {
		let self = this
		var validateIdCard = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!checkIdCard(value)) {
				callback(new Error("请输入正确的身份证号码"));
			} else {
				callback();
			}
		};
		var validateUrl = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isURL(value)) {
				callback(new Error("请输入正确的URL地址"));
			} else {
				callback();
			}
		};
		var validateMobile = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isMobile(value)) {
				callback(new Error("请输入正确的手机号码"));
			} else {
				callback();
			}
		};
		var validatePhone = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isPhone(value)) {
				callback(new Error("请输入正确的电话号码"));
			} else {
				callback();
			}
		};
		var validateEmail = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isEmail(value)) {
				callback(new Error("请输入正确的邮箱地址"));
			} else {
				callback();
			}
		};
		var validateNumber = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isNumber(value)) {
				callback(new Error("请输入数字"));
			} else {
				callback();
			}
		};
		var validateIntNumber = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isIntNumer(value)) {
				callback(new Error("请输入整数"));
			} else {
				callback();
			}
		};
		return {
			id: '',
			type: '',
			
			
			ro:{
				qiandaomingcheng : false,
				qiandaoriqi : false,
				qiandaoshijian : false,
				jiazhangzhanghao : false,
				jiazhangxingming : false,
				xueshengxingming : false,
				xueshengxingbie : false,
				nianling : false,
				nianji : false,
				shouji : false,
				touxiang : false,
			},
			
			
			ruleForm: {
				qiandaomingcheng: '',
				qiandaoriqi: '',
				qiandaoshijian: '',
				jiazhangzhanghao: '',
				jiazhangxingming: '',
				xueshengxingming: '',
				xueshengxingbie: '',
				nianling: '',
				nianji: '',
				shouji: '',
				touxiang: '',
			},
		

			
			rules: {
				qiandaomingcheng: [
				],
				qiandaoriqi: [
				],
				qiandaoshijian: [
				],
				jiazhangzhanghao: [
				],
				jiazhangxingming: [
				],
				xueshengxingming: [
				],
				xueshengxingbie: [
				],
				nianling: [
				],
				nianji: [
				],
				shouji: [
				],
				touxiang: [
				],
			}
		};
	},
	props: ["parent"],
	computed: {



	},
    components: {
    },
	created() {
		this.ruleForm.qiandaoshijian = this.getCurDateTime()
	},
	methods: {
		
		// 下载
		download(file){
			window.open(`${file}`)
		},
		// 初始化
		init(id,type) {
			if (id) {
				this.id = id;
				this.type = type;
			}
			if(this.type=='info'||this.type=='else'){
				this.info(id);
			}else if(this.type=='logistics'){
				this.logistics=false;
				this.info(id);
			}else if(this.type=='cross'){
				var obj = this.$storage.getObj('crossObj');
				for (var o in obj){
						if(o=='qiandaomingcheng'){
							this.ruleForm.qiandaomingcheng = obj[o];
							this.ro.qiandaomingcheng = true;
							continue;
						}
						if(o=='qiandaoriqi'){
							this.ruleForm.qiandaoriqi = obj[o];
							this.ro.qiandaoriqi = true;
							continue;
						}
						if(o=='qiandaoshijian'){
							this.ruleForm.qiandaoshijian = obj[o];
							this.ro.qiandaoshijian = true;
							continue;
						}
						if(o=='jiazhangzhanghao'){
							this.ruleForm.jiazhangzhanghao = obj[o];
							this.ro.jiazhangzhanghao = true;
							continue;
						}
						if(o=='jiazhangxingming'){
							this.ruleForm.jiazhangxingming = obj[o];
							this.ro.jiazhangxingming = true;
							continue;
						}
						if(o=='xueshengxingming'){
							this.ruleForm.xueshengxingming = obj[o];
							this.ro.xueshengxingming = true;
							continue;
						}
						if(o=='xueshengxingbie'){
							this.ruleForm.xueshengxingbie = obj[o];
							this.ro.xueshengxingbie = true;
							continue;
						}
						if(o=='nianling'){
							this.ruleForm.nianling = obj[o];
							this.ro.nianling = true;
							continue;
						}
						if(o=='nianji'){
							this.ruleForm.nianji = obj[o];
							this.ro.nianji = true;
							continue;
						}
						if(o=='shouji'){
							this.ruleForm.shouji = obj[o];
							this.ro.shouji = true;
							continue;
						}
						if(o=='touxiang'){
							this.ruleForm.touxiang = obj[o];
							this.ro.touxiang = true;
							continue;
						}
				}
				











			}
			
			
			// 获取用户信息
			this.$http({
				url: `${this.$storage.get('sessionTable')}/session`,
				method: "get"
			}).then(({ data }) => {
				if (data && data.code === 0) {
					
					var json = data.data;
					if(((json.jiazhangzhanghao!=''&&json.jiazhangzhanghao) || json.jiazhangzhanghao==0) && this.$storage.get("role")!="管理员"){
						this.ruleForm.jiazhangzhanghao = json.jiazhangzhanghao
						this.ro.jiazhangzhanghao = true;
					}
					if(((json.jiazhangxingming!=''&&json.jiazhangxingming) || json.jiazhangxingming==0) && this.$storage.get("role")!="管理员"){
						this.ruleForm.jiazhangxingming = json.jiazhangxingming
						this.ro.jiazhangxingming = true;
					}
					if(((json.xueshengxingming!=''&&json.xueshengxingming) || json.xueshengxingming==0) && this.$storage.get("role")!="管理员"){
						this.ruleForm.xueshengxingming = json.xueshengxingming
						this.ro.xueshengxingming = true;
					}
					if(((json.xueshengxingbie!=''&&json.xueshengxingbie) || json.xueshengxingbie==0) && this.$storage.get("role")!="管理员"){
						this.ruleForm.xueshengxingbie = json.xueshengxingbie
						this.ro.xueshengxingbie = true;
					}
					if(((json.nianling!=''&&json.nianling) || json.nianling==0) && this.$storage.get("role")!="管理员"){
						this.ruleForm.nianling = json.nianling
						this.ro.nianling = true;
					}
					if(((json.nianji!=''&&json.nianji) || json.nianji==0) && this.$storage.get("role")!="管理员"){
						this.ruleForm.nianji = json.nianji
						this.ro.nianji = true;
					}
					if(((json.shouji!=''&&json.shouji) || json.shouji==0) && this.$storage.get("role")!="管理员"){
						this.ruleForm.shouji = json.shouji
						this.ro.shouji = true;
					}
					if(((json.touxiang!=''&&json.touxiang) || json.touxiang==0) && this.$storage.get("role")!="管理员"){
						this.ruleForm.touxiang = json.touxiang
						this.ro.touxiang = true;
					}
				} else {
					this.$message.error(data.msg);
				}
			});
			
			
		},
    // 多级联动参数

    info(id) {
      this.$http({
        url: `qiandaodaka/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
        //解决前台上传图片后台不显示的问题
        let reg=new RegExp('../../../upload','g')//g代表全部
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // 提交
    onSubmit() {






















	if(this.ruleForm.touxiang!=null) {
		this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url,"g"),"");
	}

var objcross = this.$storage.getObj('crossObj');

      //更新跨表属性
       var crossuserid;
       var crossrefid;
       var crossoptnum;
       if(this.type=='cross'){
                var statusColumnName = this.$storage.get('statusColumnName');
                var statusColumnValue = this.$storage.get('statusColumnValue');
                if(statusColumnName!='') {
                        var obj = this.$storage.getObj('crossObj');
                       if(statusColumnName && !statusColumnName.startsWith("[")) {
                               for (var o in obj){
                                 if(o==statusColumnName){
                                   obj[o] = statusColumnValue;
                                 }
                               }
                               var table = this.$storage.get('crossTable');
                             this.$http({
                                 url: `${table}/update`,
                                 method: "post",
                                 data: obj
                               }).then(({ data }) => {});
                       } else {
                               crossuserid=this.$storage.get('userid');
                               crossrefid=obj['id'];
                               crossoptnum=this.$storage.get('statusColumnName');
                               crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                        }
                }
        }
       this.$refs["ruleForm"].validate(valid => {
         if (valid) {
		 if(crossrefid && crossuserid) {
			 this.ruleForm.crossuserid = crossuserid;
			 this.ruleForm.crossrefid = crossrefid;
			let params = { 
				page: 1, 
				limit: 10, 
				crossuserid:this.ruleForm.crossuserid,
				crossrefid:this.ruleForm.crossrefid,
			} 
			this.$http({ 
				url: "qiandaodaka/page", 
				method: "get", 
				params: params 
			}).then(({ 
				data 
			}) => { 
				if (data && data.code === 0) { 
				       if(data.data.total>=crossoptnum) {
					     this.$message.error(this.$storage.get('tips'));
					       return false;
				       } else {
					 this.$http({
					   url: `qiandaodaka/${!this.ruleForm.id ? "save" : "update"}`,
					   method: "post",
					   data: this.ruleForm
					 }).then(({ data }) => {
					   if (data && data.code === 0) {
					     this.$message({
					       message: "操作成功",
					       type: "success",
					       duration: 1500,
					       onClose: () => {
						 this.parent.showFlag = true;
						 this.parent.addOrUpdateFlag = false;
						 this.parent.qiandaodakaCrossAddOrUpdateFlag = false;
						 this.parent.search();
						 this.parent.contentStyleChange();
					       }
					     });
					   } else {
					     this.$message.error(data.msg);
					   }
					 });

				       }
				} else { 
				} 
			});
		 } else {
			 this.$http({
			   url: `qiandaodaka/${!this.ruleForm.id ? "save" : "update"}`,
			   method: "post",
			   data: this.ruleForm
			 }).then(({ data }) => {
			   if (data && data.code === 0) {
			     this.$message({
			       message: "操作成功",
			       type: "success",
			       duration: 1500,
			       onClose: () => {
				 this.parent.showFlag = true;
				 this.parent.addOrUpdateFlag = false;
				 this.parent.qiandaodakaCrossAddOrUpdateFlag = false;
				 this.parent.search();
				 this.parent.contentStyleChange();
			       }
			     });
			   } else {
			     this.$message.error(data.msg);
			   }
			 });
		 }
         }
       });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.qiandaodakaCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
    touxiangUploadChange(fileUrls) {
	    this.ruleForm.touxiang = fileUrls;
    },
  }
};
</script>
<style lang="scss" scoped>
	.amap-wrapper {
		width: 100%;
		height: 500px;
	}
	
	.search-box {
		position: absolute;
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
	
	.add-update-preview .btn .btn1 {
				border: 1px solid rgba(19,161,230,.2);
				cursor: pointer;
				padding: 0 20px;
				margin: 0px 4px;
				color: rgba(19,161,230,.8);
				display: inline-block;
				font-size: 16px;
				line-height: 24px;
				border-radius: 4px;
				outline: none;
				background: rgba(255,255,255,1);
				width: auto;
				height: 40px;
			}
	
	.add-update-preview .btn .btn1:hover {
				border: 1px solid #999;
				color: #333;
				background: rgba(255,255,255,1);
				opacity: 0.8;
			}
	
	.add-update-preview .btn .btn2 {
				border: 1px solid rgba(19,161,230,.2);
				cursor: pointer;
				border-radius: 4px;
				padding: 0 20px;
				margin: 0px 4px;
				outline: none;
				color: rgba(19,161,230,.8);
				background: #fff;
				width: auto;
				font-size: 16px;
				line-height: 24px;
				height: 40px;
			}
	
	.add-update-preview .btn .btn2:hover {
				border: 1px solid #999;
				color: #333;
				background: #fff;
				opacity: 0.8;
			}
	
	.add-update-preview .btn .btn3 {
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
	
	.add-update-preview .btn .btn3:hover {
				border: 1px solid #999;
				color: #333;
				background: #fff;
				opacity: 0.8;
			}
	
	.add-update-preview .btn .btn4 {
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
	
	.add-update-preview .btn .btn4:hover {
				border: 1px solid #999;
				color: #333;
				background: #fff;
				opacity: 0.8;
			}
	
	.add-update-preview .btn .btn5 {
				border: 1px solid rgba(19,161,230,.2);
				cursor: pointer;
				border-radius: 4px;
				padding: 0 20px;
				margin: 4px;
				outline: none;
				color: rgba(19,161,230,.8);
				background: rgba(255,255,255,1);
				width: auto;
				font-size: 16px;
				line-height: 24px;
				height: 40px;
			}
	
	.add-update-preview .btn .btn5:hover {
				border: 1px solid #999;
				color: #333;
				background: #fff;
				opacity: 0.8;
			}
</style>
