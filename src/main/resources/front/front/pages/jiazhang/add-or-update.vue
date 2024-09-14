<template>
<view class="content">
	<view :style='{"minHeight":"100vh","width":"100%","padding":"0 0 240rpx","position":"relative","background":"url() fixed,#fff","height":"auto"}'>
		<form :style='{"width":"100%","padding":"60rpx 40rpx","background":"none","display":"block","height":"auto"}' class="app-update-pv">
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","display":"flex","minHeight":"120rpx","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 20rpx 0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">家长账号</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.jiazhangzhanghao" v-model="ruleForm.jiazhangzhanghao" placeholder="家长账号"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","display":"flex","minHeight":"120rpx","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 20rpx 0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">家长姓名</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.jiazhangxingming" v-model="ruleForm.jiazhangxingming" placeholder="家长姓名"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","display":"flex","minHeight":"120rpx","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 20rpx 0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">密码</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.mima" v-model="ruleForm.mima" placeholder="密码"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","display":"flex","minHeight":"120rpx","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 20rpx 0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">学生姓名</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.xueshengxingming" v-model="ruleForm.xueshengxingming" placeholder="学生姓名"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","display":"flex","minHeight":"120rpx","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","width":"100%","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"width":"auto","padding":"0 20rpx 0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">学生性别</view>
				<picker :style='{"width":"100%","flex":"1","height":"auto"}' @change="xueshengxingbieChange" :value="xueshengxingbieIndex"  :range="xueshengxingbieOptions">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#666"}' class="uni-input">{{ruleForm.xueshengxingbie?ruleForm.xueshengxingbie:"请选择学生性别"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","display":"flex","minHeight":"120rpx","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 20rpx 0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">年龄</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.nianling" v-model="ruleForm.nianling" placeholder="年龄"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","display":"flex","minHeight":"120rpx","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","width":"100%","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"width":"auto","padding":"0 20rpx 0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">年级</view>
				<picker :style='{"width":"100%","flex":"1","height":"auto"}' @change="nianjiChange" :value="nianjiIndex"  :range="nianjiOptions">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#666"}' class="uni-input">{{ruleForm.nianji?ruleForm.nianji:"请选择年级"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","display":"flex","minHeight":"120rpx","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 20rpx 0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">手机</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.shouji" v-model="ruleForm.shouji" placeholder="手机"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","display":"flex","minHeight":"120rpx","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","width":"100%","borderStyle":"solid","height":"auto"}' class="" @tap="touxiangTap">
				<view :style='{"width":"auto","padding":"0 20rpx 0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">头像</view>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-if="ruleForm.touxiang" :src="baseUrl+ruleForm.touxiang.split(',')[0]" mode="aspectFill"></image>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","display":"flex","minHeight":"120rpx","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","width":"100%","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"width":"auto","padding":"0 20rpx 0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">是否会员</view>
				<picker :style='{"width":"100%","flex":"1","height":"auto"}' @change="vipChange" :value="vipIndex"  :range="vipOptions">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#666"}' class="uni-input">{{ruleForm.vip?ruleForm.vip:"请选择是否会员"}}</view>
				</picker>
			</view>
			
			<!-- 否 -->
 

			
			
			<view :style='{"width":"100%","margin":"40rpx 0 0 0","justifyContent":"center","display":"flex","height":"auto"}' class="btn" >
				<button :style='{"padding":"0 40rpx","boxShadow":"2rpx 4rpx 8rpx #ccc","margin":"0 40rpx 0 0","borderColor":"#ef6d0d","color":"#333","display":"inline","minWidth":"200rpx","borderRadius":"40rpx","background":"linear-gradient(180deg, rgba(253,246,139,1) 0%, rgba(254,233,97,1) 84%, rgba(255,220,52,1) 100%),#ffdc34","borderWidth":"0 0 8rpx","width":"auto","lineHeight":"72rpx","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

	</view>
</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";
    import xiaEditor from '@/components/xia-editor/xia-editor';
    import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";
	export default {
		data() {
			return {
				cross:'',
				ruleForm: {
				jiazhangzhanghao: '',
				jiazhangxingming: '',
				mima: '',
				xueshengxingming: '',
				xueshengxingbie: '',
				nianling: '',
				nianji: '',
				shouji: '',
				touxiang: '',
				vip: '',
				},
				xueshengxingbieOptions: [],
				xueshengxingbieIndex: 0,
				nianjiOptions: [],
				nianjiIndex: 0,
				vipOptions: [],
				vipIndex: 0,
				// 登录用户信息
				user: {},
                ro:{
                   jiazhangzhanghao : false,
                   jiazhangxingming : false,
                   mima : false,
                   xueshengxingming : false,
                   xueshengxingbie : false,
                   nianling : false,
                   nianji : false,
                   shouji : false,
                   touxiang : false,
                   vip : false,
                },
			}
		},
		components: {
			wPicker,
            xiaEditor,
            multipleSelect
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},



		},
		async onLoad(options) {
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss读取


			// 自定义下拉框值
			this.xueshengxingbieOptions = "男,女".split(',')
			// 自定义下拉框值
			this.nianjiOptions = "一年级,二年级,三年级,四年级,五年级,六年级".split(',')
			// 自定义下拉框值
			this.vipOptions = "是,否".split(',')

			// 如果有登录，获取登录后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`jiazhang`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			this.cross = options.cross;
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
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
					if(o=='mima'){
					this.ruleForm.mima = obj[o];
					this.ro.mima = true;
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
					this.ruleForm.touxiang = obj[o].split(",")[0];
					this.ro.touxiang = true;
					continue;
					}
					if(o=='vip'){
					this.ruleForm.vip = obj[o];
					this.ro.vip = true;
					continue;
					}
				}
			}
			this.styleChange()
            this.$forceUpdate()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv . .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},

			// 多级联动参数



			// 下拉变化
			xueshengxingbieChange(e) {
				this.xueshengxingbieIndex = e.target.value
				this.ruleForm.xueshengxingbie = this.xueshengxingbieOptions[this.xueshengxingbieIndex]
			},
			// 下拉变化
			nianjiChange(e) {
				this.nianjiIndex = e.target.value
				this.ruleForm.nianji = this.nianjiOptions[this.nianjiIndex]
			},
			// 下拉变化
			vipChange(e) {
				this.vipIndex = e.target.value
				this.ruleForm.vip = this.vipOptions[this.vipIndex]
			},

			touxiangTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.touxiang = 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},

			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {






                if((this.ruleForm.mima.length<2)){
                    this.$utils.msg(`密码长度不能小于2`);
                    return
                }
                if((this.ruleForm.mima.length>10)){
                    this.$utils.msg(`密码长度不能大于10`);
                    return
                }















//跨表计算判断
				var obj;
				if((!this.ruleForm.jiazhangzhanghao)){
					this.$utils.msg(`家长账号不能为空`);
					return
				}
				if((!this.ruleForm.jiazhangxingming)){
					this.$utils.msg(`家长姓名不能为空`);
					return
				}
				if((!this.ruleForm.mima)){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if(this.ruleForm.nianling&&(!this.$validate.isIntNumer(this.ruleForm.nianling))){
					this.$utils.msg(`年龄应输入整数`);
					return
				}
				if(this.ruleForm.shouji&&(!this.$validate.isMobile(this.ruleForm.shouji))){
					this.$utils.msg(`手机应输入手机格式`);
					return
				}
				//更新跨表属性
			       var crossuserid;
			       var crossrefid;
			       var crossoptnum;
				if(this.cross){
                    uni.setStorageSync('crossCleanType',true);
					var statusColumnName = uni.getStorageSync('statusColumnName');
					var statusColumnValue = uni.getStorageSync('statusColumnValue');
					if(statusColumnName!='') {
                        if(!obj) {
						    obj = uni.getStorageSync('crossObj');
                        }
						if(!statusColumnName.startsWith("[")) {
							for (var o in obj){
								if(o==statusColumnName){
									obj[o] = statusColumnValue;
								}

							}
							var table = uni.getStorageSync('crossTable');
							await this.$api.update(`${table}`, obj);
						} else {
						       crossuserid=Number(uni.getStorageSync('userid'));
						       crossrefid=obj['id'];
						       crossoptnum=uni.getStorageSync('statusColumnName');
						       crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
						}
					}
				}
				if(crossrefid && crossuserid) {
					this.ruleForm.crossuserid=crossuserid;
					this.ruleForm.crossrefid=crossrefid;
					let params = {
						page: 1,
						limit:10,
						crossuserid:crossuserid,
						crossrefid:crossrefid,
					}
					let res = await this.$api.list(`jiazhang`, params);
					if (res.data.total >= crossoptnum) {
						this.$utils.msg(uni.getStorageSync('tips'));
                        uni.removeStorageSync('crossCleanType');
						return false;
					} else {
                //跨表计算
						if(this.ruleForm.id){
							await this.$api.update(`jiazhang`, this.ruleForm);
						}else{
							await this.$api.add(`jiazhang`, this.ruleForm);
						}
						this.$utils.msgBack('提交成功');
					}
				} else {
                //跨表计算
					if(this.ruleForm.id){
						await this.$api.update(`jiazhang`, this.ruleForm);
					}else{
						await this.$api.add(`jiazhang`, this.ruleForm);
					}
					this.$utils.msgBack('提交成功');
				}
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>
