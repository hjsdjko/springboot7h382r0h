<template>
<view class="content">
	<view class="box" :style='{"minHeight":"100vh","width":"100%","padding":"0 0 240rpx","position":"relative","background":"url() fixed,#fff","height":"auto"}'>
		<view :style='{"width":"100%","padding":"60rpx 40rpx","background":"none","display":"block","height":"auto"}'>
			<view :style='{"padding":"0 20rpx 8rpx","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"center","display":"flex","minHeight":"120rpx","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='jiazhang'" class="">
				<view class="title" :style='{"width":"auto","padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'>家长账号</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' disabled="true"  v-model="ruleForm.jiazhangzhanghao" placeholder="家长账号"></input>
			</view>
			<view :style='{"padding":"0 20rpx 8rpx","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"center","display":"flex","minHeight":"120rpx","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='jiazhang'" class="">
				<view class="title" :style='{"width":"auto","padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'>家长姓名</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}'   v-model="ruleForm.jiazhangxingming" placeholder="家长姓名"></input>
			</view>
			<view :style='{"padding":"0 20rpx 8rpx","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"center","display":"flex","minHeight":"120rpx","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='jiazhang'" class="">
				<view class="title" :style='{"width":"auto","padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'>密码</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}'  type="password" v-model="ruleForm.mima" placeholder="密码"></input>
			</view>
			<view :style='{"padding":"0 20rpx 8rpx","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"center","display":"flex","minHeight":"120rpx","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='jiazhang'" class="">
				<view class="title" :style='{"width":"auto","padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'>学生姓名</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}'   v-model="ruleForm.xueshengxingming" placeholder="学生姓名"></input>
			</view>
			<view v-if="tableName=='jiazhang'" :style='{"padding":"0 20rpx 8rpx","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"center","display":"flex","minHeight":"120rpx","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","width":"100%","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"width":"auto","padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">学生性别</view>
				<picker :style='{"width":"100%","flex":"1","height":"auto"}'  @change="jiazhangxueshengxingbieChange" :value="jiazhangxueshengxingbieIndex" :range="jiazhangxueshengxingbieOptions">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#666"}' class="uni-input picker-select-input">{{ruleForm.xueshengxingbie?ruleForm.xueshengxingbie:"请选择学生性别"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"0 20rpx 8rpx","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"center","display":"flex","minHeight":"120rpx","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='jiazhang'" class="">
				<view class="title" :style='{"width":"auto","padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'>年龄</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}'   v-model="ruleForm.nianling" placeholder="年龄"></input>
			</view>
			<view v-if="tableName=='jiazhang'" :style='{"padding":"0 20rpx 8rpx","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"center","display":"flex","minHeight":"120rpx","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","width":"100%","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"width":"auto","padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">年级</view>
				<picker :style='{"width":"100%","flex":"1","height":"auto"}'  @change="jiazhangnianjiChange" :value="jiazhangnianjiIndex" :range="jiazhangnianjiOptions">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#666"}' class="uni-input picker-select-input">{{ruleForm.nianji?ruleForm.nianji:"请选择年级"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"0 20rpx 8rpx","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"center","display":"flex","minHeight":"120rpx","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='jiazhang'" class="">
				<view class="title" :style='{"width":"auto","padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'>手机</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}'   v-model="ruleForm.shouji" placeholder="手机"></input>
			</view>
			<view :style='{"padding":"0 20rpx 8rpx","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"center","display":"flex","minHeight":"120rpx","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='jiazhang'" @tap="jiazhangtouxiangTap" class="">
				<view class="title" :style='{"width":"auto","padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'>头像</view>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' v-if="ruleForm.touxiang" style="margin: 0;" class="avator" :src="baseUrl+ruleForm.touxiang" mode=""></image>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' v-else class="avator" style="margin: 0;" src="../../static/gen/upload.png" mode=""></image>
			</view>
			<view v-if="tableName=='jiazhang'" :style='{"padding":"0 20rpx 8rpx","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"center","display":"flex","minHeight":"120rpx","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","width":"100%","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"width":"auto","padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">是否会员</view>
				<picker :style='{"width":"100%","flex":"1","height":"auto"}' disabled="true" @change="jiazhangvipChange" :value="jiazhangvipIndex" :range="jiazhangvipOptions">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#666"}' class="uni-input picker-select-input">{{ruleForm.vip?ruleForm.vip:"请选择是否会员"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"0 20rpx 8rpx","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"center","display":"flex","minHeight":"120rpx","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='huodongzuzhizhe'" class="">
				<view class="title" :style='{"width":"auto","padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'>账号</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' disabled="true"  v-model="ruleForm.zhanghao" placeholder="账号"></input>
			</view>
			<view :style='{"padding":"0 20rpx 8rpx","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"center","display":"flex","minHeight":"120rpx","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='huodongzuzhizhe'" class="">
				<view class="title" :style='{"width":"auto","padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'>姓名</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}'   v-model="ruleForm.xingming" placeholder="姓名"></input>
			</view>
			<view :style='{"padding":"0 20rpx 8rpx","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"center","display":"flex","minHeight":"120rpx","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='huodongzuzhizhe'" class="">
				<view class="title" :style='{"width":"auto","padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'>密码</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}'  type="password" v-model="ruleForm.mima" placeholder="密码"></input>
			</view>
			<view v-if="tableName=='huodongzuzhizhe'" :style='{"padding":"0 20rpx 8rpx","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"center","display":"flex","minHeight":"120rpx","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","width":"100%","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"width":"auto","padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}' class="title">性别</view>
				<picker :style='{"width":"100%","flex":"1","height":"auto"}'  @change="huodongzuzhizhexingbieChange" :value="huodongzuzhizhexingbieIndex" :range="huodongzuzhizhexingbieOptions">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#666"}' class="uni-input picker-select-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"0 20rpx 8rpx","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"center","display":"flex","minHeight":"120rpx","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='huodongzuzhizhe'" class="">
				<view class="title" :style='{"width":"auto","padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'>年龄</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}'   v-model="ruleForm.nianling" placeholder="年龄"></input>
			</view>
			<view :style='{"padding":"0 20rpx 8rpx","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"center","display":"flex","minHeight":"120rpx","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='huodongzuzhizhe'" class="">
				<view class="title" :style='{"width":"auto","padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'>联系方式</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#666","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}'   v-model="ruleForm.lianxifangshi" placeholder="联系方式"></input>
			</view>
			<view :style='{"padding":"0 20rpx 8rpx","boxShadow":"inset 0px 0px 0px 0px #f9edd9","margin":"0 0 20rpx 0","borderColor":"#e9be70","alignItems":"center","display":"flex","minHeight":"120rpx","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='huodongzuzhizhe'" @tap="huodongzuzhizhetouxiangTap" class="">
				<view class="title" :style='{"width":"auto","padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","textAlign":"right"}'>头像</view>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' v-if="ruleForm.touxiang" style="margin: 0;" class="avator" :src="baseUrl+ruleForm.touxiang" mode=""></image>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' v-else class="avator" style="margin: 0;" src="../../static/gen/upload.png" mode=""></image>
			</view>
			<view :style='{"width":"100%","margin":"48rpx 0 0","justifyContent":"center","display":"flex","height":"auto"}' class="btn">
				<button @tap="update()" class="cu-btn lg" :style='{"padding":"0 40rpx","boxShadow":"2rpx 4rpx 8rpx #ccc","margin":"0 20rpx","borderColor":"#ef6d0d","color":"#333","minWidth":"200rpx","borderRadius":"40rpx","background":"linear-gradient(180deg, rgba(253,246,139,1) 0%, rgba(254,233,97,1) 84%, rgba(255,220,52,1) 100%),#ffdc34","borderWidth":"0 0 8rpx","width":"auto","lineHeight":"72rpx","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'>保存</button>
				<button @tap="logout()" class="cu-btn lg" :style='{"padding":"0 40rpx","boxShadow":"2rpx 4rpx 8rpx #ccc","margin":"0 20rpx","borderColor":"#999","color":"#333","minWidth":"200rpx","borderRadius":"40rpx","background":"linear-gradient(180deg, rgba(238,238,238,1) 0%, rgba(204,204,204,1) 100%),#bbb","borderWidth":"0 0 8rpx","width":"auto","lineHeight":"72rpx","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'>退出登录</button>
			</view>
		</view>
	</view>
</view>
</template>

<script>
    import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";
	export default {
		data() {
			return {
				ruleForm: {
				},
				tableName:"",
				jiazhangxueshengxingbieOptions: [],
				jiazhangxueshengxingbieIndex: 0,
				jiazhangnianjiOptions: [],
				jiazhangnianjiIndex: 0,
				jiazhangvipOptions: [],
				jiazhangvipIndex: 0,
				huodongzuzhizhexingbieOptions: [],
				huodongzuzhizhexingbieIndex: 0,
			}
		},
        components: {
            multipleSelect
        },
		computed: {
			baseUrl() {
				return this.$base.url;
			}
		},
		async onLoad() {
			let table = uni.getStorageSync("nowTable");
			let res = await this.$api.session(table);
			this.ruleForm = res.data;
			this.tableName = table;
			// 自定义下拉框值
			if(this.tableName=='jiazhang'){
				this.jiazhangxueshengxingbieOptions = "男,女".split(',');
				this.jiazhangxueshengxingbieOptions.forEach((item, index) => {
					if(item==this.ruleForm.xueshengxingbie) {
						this.jiazhangxueshengxingbieIndex = index;
					}
				});
			}
			// 自定义下拉框值
			if(this.tableName=='jiazhang'){
				this.jiazhangnianjiOptions = "一年级,二年级,三年级,四年级,五年级,六年级".split(',');
				this.jiazhangnianjiOptions.forEach((item, index) => {
					if(item==this.ruleForm.nianji) {
						this.jiazhangnianjiIndex = index;
					}
				});
			}
			// 自定义下拉框值
			if(this.tableName=='jiazhang'){
				this.jiazhangvipOptions = "是,否".split(',');
				this.jiazhangvipOptions.forEach((item, index) => {
					if(item==this.ruleForm.vip) {
						this.jiazhangvipIndex = index;
					}
				});
			}
			// 自定义下拉框值
			if(this.tableName=='huodongzuzhizhe'){
				this.huodongzuzhizhexingbieOptions = "男,女".split(',');
				this.huodongzuzhizhexingbieOptions.forEach((item, index) => {
					if(item==this.ruleForm.xingbie) {
						this.huodongzuzhizhexingbieIndex = index;
					}
				});
			}
			this.styleChange()
            this.$forceUpdate()
		},
		methods: {
            // 下拉变化
            jiazhangxueshengxingbieChange(e) {
                    this.jiazhangxueshengxingbieIndex = e.target.value
                    this.ruleForm.xueshengxingbie = this.jiazhangxueshengxingbieOptions[this.jiazhangxueshengxingbieIndex]
            },
            // 下拉变化
            jiazhangnianjiChange(e) {
                    this.jiazhangnianjiIndex = e.target.value
                    this.ruleForm.nianji = this.jiazhangnianjiOptions[this.jiazhangnianjiIndex]
            },
			jiazhangtouxiangTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.touxiang = 'upload/' + res.file;
					_this.$forceUpdate();
				});
			},
            // 下拉变化
            jiazhangvipChange(e) {
                    this.jiazhangvipIndex = e.target.value
                    this.ruleForm.vip = this.jiazhangvipOptions[this.jiazhangvipIndex]
            },
            // 下拉变化
            huodongzuzhizhexingbieChange(e) {
                    this.huodongzuzhizhexingbieIndex = e.target.value
                    this.ruleForm.xingbie = this.huodongzuzhizhexingbieOptions[this.huodongzuzhizhexingbieIndex]
            },
			huodongzuzhizhetouxiangTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.touxiang = 'upload/' + res.file;
					_this.$forceUpdate();
				});
			},

            toggleTab(str) {
                this.$refs[str].show();
            },

			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('. .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.userInfoForm.list.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			logout() {
				uni.setStorageSync('token', '');
				this.$utils.jump('../login/login');
			},
			// 注册
			async update() {
				if((!this.ruleForm.jiazhangzhanghao) && `jiazhang` == this.tableName){
					this.$utils.msg(`家长账号不能为空`);
					return
				}
				if((!this.ruleForm.jiazhangxingming) && `jiazhang` == this.tableName){
					this.$utils.msg(`家长姓名不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `jiazhang` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if(`jiazhang` == this.tableName && this.ruleForm.nianling&&(!this.$validate.isIntNumer(this.ruleForm.nianling))){
					this.$utils.msg(`年龄应输入整数`);
					return
				}
				if(`jiazhang` == this.tableName && this.ruleForm.shouji&&(!this.$validate.isMobile(this.ruleForm.shouji))){
					this.$utils.msg(`手机应输入手机格式`);
					return
				}
				if((!this.ruleForm.zhanghao) && `huodongzuzhizhe` == this.tableName){
					this.$utils.msg(`账号不能为空`);
					return
				}
				if((!this.ruleForm.xingming) && `huodongzuzhizhe` == this.tableName){
					this.$utils.msg(`姓名不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `huodongzuzhizhe` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if(`huodongzuzhizhe` == this.tableName && this.ruleForm.nianling&&(!this.$validate.isIntNumer(this.ruleForm.nianling))){
					this.$utils.msg(`年龄应输入整数`);
					return
				}
				if(`huodongzuzhizhe` == this.tableName && this.ruleForm.lianxifangshi&&(!this.$validate.isMobile(this.ruleForm.lianxifangshi))){
					this.$utils.msg(`联系方式应输入手机格式`);
					return
				}
				let table = uni.getStorageSync("nowTable");
				await this.$api.update(table, this.ruleForm);
				this.$utils.msgBack('修改成功');;
			},

		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>
