<template>
<view class="content">
	<view :style='{"minHeight":"100vh","width":"100%","padding":"0 0 240rpx","position":"relative","background":"url() fixed,#fff","height":"auto"}'>
		<form :style='{"width":"100%","padding":"60rpx 40rpx","background":"none","display":"block","height":"auto"}' class="app-update-pv">
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","display":"flex","minHeight":"120rpx","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 20rpx 0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">名称</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.name" v-model="ruleForm.name" placeholder="名称"></input>
			</view>
			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","display":"flex","minHeight":"120rpx","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","width":"100%","borderStyle":"solid","height":"auto"}' class="" @tap="valueTap">
				<view :style='{"width":"auto","padding":"0 20rpx 0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">值</view>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-if="ruleForm.value" :src="baseUrl+ruleForm.value.split(',')[0]" mode="aspectFill"></image>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
			</view>
			
			<!-- ${location} -->
 

			<view :style='{"padding":"12rpx 0","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"baseline","display":"flex","minHeight":"120rpx","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"auto","padding":"0 20rpx 0 40rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">url</view>
				<textarea :style='{"border":"0","minHeight":"240rpx","padding":"24rpx 40rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx"}' v-model="ruleForm.url" placeholder="url"></textarea>
			</view>
			
			
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
				name: '',
				value: '',
				url: '',
				},
				// 登录用户信息
				user: {},
                ro:{
                   name : false,
                   value : false,
                   url : false,
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
				res = await this.$api.info(`config`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			this.cross = options.cross;
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='name'){
					this.ruleForm.name = obj[o];
					this.ro.name = true;
					continue;
					}
					if(o=='value'){
					this.ruleForm.value = obj[o].split(",")[0];
					this.ro.value = true;
					continue;
					}
					if(o=='url'){
					this.ruleForm.url = obj[o];
					this.ro.url = true;
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




			valueTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.value = 'upload/' + res.file;
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







//跨表计算判断
				var obj;
				if((!this.ruleForm.name)){
					this.$utils.msg(`名称不能为空`);
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
					let res = await this.$api.list(`config`, params);
					if (res.data.total >= crossoptnum) {
						this.$utils.msg(uni.getStorageSync('tips'));
                        uni.removeStorageSync('crossCleanType');
						return false;
					} else {
                //跨表计算
						if(this.ruleForm.id){
							await this.$api.update(`config`, this.ruleForm);
						}else{
							await this.$api.add(`config`, this.ruleForm);
						}
						this.$utils.msgBack('提交成功');
					}
				} else {
                //跨表计算
					if(this.ruleForm.id){
						await this.$api.update(`config`, this.ruleForm);
					}else{
						await this.$api.add(`config`, this.ruleForm);
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
