<template>
<view class="content">
	<view class="box" :style='{"minHeight":"100vh","width":"100%","padding":"200rpx 80rpx 80rpx","background":"url(http://codegen.caihongy.cn/20221221/d43d607ac21d4ea593130b716e7a7795.gif) no-repeat center top / 100% auto,linear-gradient(180deg, rgba(124,210,235,1) 0%, rgba(33,121,222,1) 100%),#2179de","height":"100%"}'>
		<view :style='{"padding":"60rpx 40rpx","boxShadow":"0px 0px 0px #ddd","borderRadius":"12rpx","background":"none","display":"block","width":"100%","height":"auto"}'>
			<image :style='{"width":"160rpx","margin":"0 auto 24rpx auto","borderRadius":"8rpx","display":"none","height":"160rpx"}' src="http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg" mode="aspectFill"></image>
			<view :style='{"width":"100%","margin":"0 0 20rpx 0","height":"auto"}' v-if="tableName=='jiazhang'" class="uni-form-item uni-column">
				<input :style='{"padding":"0px 24rpx","boxShadow":"4rpx 4rpx 0px #2c77cb","margin":"0px","borderColor":"#e9be70","color":"#698fad","borderRadius":"12rpx","background":"#b5d9f4","borderWidth":"0px","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'  v-model="ruleForm.jiazhangzhanghao"  type="text"  class="uni-input" name="" placeholder="家长账号" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 20rpx 0","height":"auto"}' v-if="tableName=='jiazhang'" class="uni-form-item uni-column">
				<input :style='{"padding":"0px 24rpx","boxShadow":"4rpx 4rpx 0px #2c77cb","margin":"0px","borderColor":"#e9be70","color":"#698fad","borderRadius":"12rpx","background":"#b5d9f4","borderWidth":"0px","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'  v-model="ruleForm.jiazhangxingming"  type="text"  class="uni-input" name="" placeholder="家长姓名" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 20rpx 0","height":"auto"}' v-if="tableName=='jiazhang'" class="uni-form-item uni-column">
				<input :style='{"padding":"0px 24rpx","boxShadow":"4rpx 4rpx 0px #2c77cb","margin":"0px","borderColor":"#e9be70","color":"#698fad","borderRadius":"12rpx","background":"#b5d9f4","borderWidth":"0px","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'  v-model="ruleForm.mima" type="password"  class="uni-input" name="" placeholder="密码" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 20rpx 0","height":"auto"}' v-if="tableName=='jiazhang'" class="uni-form-item uni-column">
				<input :style='{"padding":"0px 24rpx","boxShadow":"4rpx 4rpx 0px #2c77cb","margin":"0px","borderColor":"#e9be70","color":"#698fad","borderRadius":"12rpx","background":"#b5d9f4","borderWidth":"0px","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.mima2" type="password" class="uni-input" name="" placeholder="确认密码" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 20rpx 0","height":"auto"}' v-if="tableName=='jiazhang'" class="uni-form-item uni-column">
				<input :style='{"padding":"0px 24rpx","boxShadow":"4rpx 4rpx 0px #2c77cb","margin":"0px","borderColor":"#e9be70","color":"#698fad","borderRadius":"12rpx","background":"#b5d9f4","borderWidth":"0px","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'  v-model="ruleForm.xueshengxingming"  type="text"  class="uni-input" name="" placeholder="学生姓名" />
			</view>
			<picker :style='{"boxShadow":"4rpx 4rpx 0px #2c77cb","margin":"24rpx 0 24rpx 0","borderColor":"#e9be70","borderRadius":"12rpx","background":"#b5d9f4","borderWidth":"0px","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='jiazhang'"  @change="jiazhangxueshengxingbieChange" :value="jiazhangxueshengxingbieIndex" :range="jiazhangxueshengxingbieOptions">
				<view :style='{"width":"100%","padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#767676"}' class="uni-input">{{ruleForm.xueshengxingbie?ruleForm.xueshengxingbie:"请选择学生性别"}}</view>
			</picker>
			<view :style='{"width":"100%","margin":"0 0 20rpx 0","height":"auto"}' v-if="tableName=='jiazhang'" class="uni-form-item uni-column">
				<input :style='{"padding":"0px 24rpx","boxShadow":"4rpx 4rpx 0px #2c77cb","margin":"0px","borderColor":"#e9be70","color":"#698fad","borderRadius":"12rpx","background":"#b5d9f4","borderWidth":"0px","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'  v-model="ruleForm.nianling"  type="text"  class="uni-input" name="" placeholder="年龄" />
			</view>
			<picker :style='{"boxShadow":"4rpx 4rpx 0px #2c77cb","margin":"24rpx 0 24rpx 0","borderColor":"#e9be70","borderRadius":"12rpx","background":"#b5d9f4","borderWidth":"0px","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='jiazhang'"  @change="jiazhangnianjiChange" :value="jiazhangnianjiIndex" :range="jiazhangnianjiOptions">
				<view :style='{"width":"100%","padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#767676"}' class="uni-input">{{ruleForm.nianji?ruleForm.nianji:"请选择年级"}}</view>
			</picker>
			<view :style='{"width":"100%","margin":"0 0 20rpx 0","height":"auto"}' v-if="tableName=='jiazhang'" class="uni-form-item uni-column">
				<input :style='{"padding":"0px 24rpx","boxShadow":"4rpx 4rpx 0px #2c77cb","margin":"0px","borderColor":"#e9be70","color":"#698fad","borderRadius":"12rpx","background":"#b5d9f4","borderWidth":"0px","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'  v-model="ruleForm.shouji"  type="text"  class="uni-input" name="" placeholder="手机" />
			</view>
            <view :style='{"width":"100%","margin":"0 0 20rpx 0","height":"auto"}' v-if="tableName=='jiazhang'" @tap="jiazhangtouxiangTap" class="">
                <view>请上传头像</view>
                <image :style='{"border":"0px solid #ccc","width":"200rpx","borderRadius":"16rpx","objectFit":"cover","display":"block","height":"160rpx"}' v-if="ruleForm.touxiang" class="avator" :src="baseUrl+ruleForm.touxiang" mode=""></image>
                <image :style='{"border":"0px solid #ccc","width":"200rpx","borderRadius":"16rpx","objectFit":"cover","display":"block","height":"160rpx"}' v-else class="avator" src="../../static/gen/upload.png" mode=""></image>
            </view>
			<view :style='{"width":"100%","margin":"0 0 20rpx 0","height":"auto"}' v-if="tableName=='huodongzuzhizhe'" class="uni-form-item uni-column">
				<input :style='{"padding":"0px 24rpx","boxShadow":"4rpx 4rpx 0px #2c77cb","margin":"0px","borderColor":"#e9be70","color":"#698fad","borderRadius":"12rpx","background":"#b5d9f4","borderWidth":"0px","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'  v-model="ruleForm.zhanghao"  type="text"  class="uni-input" name="" placeholder="账号" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 20rpx 0","height":"auto"}' v-if="tableName=='huodongzuzhizhe'" class="uni-form-item uni-column">
				<input :style='{"padding":"0px 24rpx","boxShadow":"4rpx 4rpx 0px #2c77cb","margin":"0px","borderColor":"#e9be70","color":"#698fad","borderRadius":"12rpx","background":"#b5d9f4","borderWidth":"0px","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'  v-model="ruleForm.xingming"  type="text"  class="uni-input" name="" placeholder="姓名" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 20rpx 0","height":"auto"}' v-if="tableName=='huodongzuzhizhe'" class="uni-form-item uni-column">
				<input :style='{"padding":"0px 24rpx","boxShadow":"4rpx 4rpx 0px #2c77cb","margin":"0px","borderColor":"#e9be70","color":"#698fad","borderRadius":"12rpx","background":"#b5d9f4","borderWidth":"0px","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'  v-model="ruleForm.mima" type="password"  class="uni-input" name="" placeholder="密码" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 20rpx 0","height":"auto"}' v-if="tableName=='huodongzuzhizhe'" class="uni-form-item uni-column">
				<input :style='{"padding":"0px 24rpx","boxShadow":"4rpx 4rpx 0px #2c77cb","margin":"0px","borderColor":"#e9be70","color":"#698fad","borderRadius":"12rpx","background":"#b5d9f4","borderWidth":"0px","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.mima2" type="password" class="uni-input" name="" placeholder="确认密码" />
			</view>
			<picker :style='{"boxShadow":"4rpx 4rpx 0px #2c77cb","margin":"24rpx 0 24rpx 0","borderColor":"#e9be70","borderRadius":"12rpx","background":"#b5d9f4","borderWidth":"0px","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='huodongzuzhizhe'"  @change="huodongzuzhizhexingbieChange" :value="huodongzuzhizhexingbieIndex" :range="huodongzuzhizhexingbieOptions">
				<view :style='{"width":"100%","padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#767676"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
			</picker>
			<view :style='{"width":"100%","margin":"0 0 20rpx 0","height":"auto"}' v-if="tableName=='huodongzuzhizhe'" class="uni-form-item uni-column">
				<input :style='{"padding":"0px 24rpx","boxShadow":"4rpx 4rpx 0px #2c77cb","margin":"0px","borderColor":"#e9be70","color":"#698fad","borderRadius":"12rpx","background":"#b5d9f4","borderWidth":"0px","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'  v-model="ruleForm.nianling"  type="text"  class="uni-input" name="" placeholder="年龄" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 20rpx 0","height":"auto"}' v-if="tableName=='huodongzuzhizhe'" class="uni-form-item uni-column">
				<input :style='{"padding":"0px 24rpx","boxShadow":"4rpx 4rpx 0px #2c77cb","margin":"0px","borderColor":"#e9be70","color":"#698fad","borderRadius":"12rpx","background":"#b5d9f4","borderWidth":"0px","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'  v-model="ruleForm.lianxifangshi"  type="text"  class="uni-input" name="" placeholder="联系方式" />
			</view>
            <view :style='{"width":"100%","margin":"0 0 20rpx 0","height":"auto"}' v-if="tableName=='huodongzuzhizhe'" @tap="huodongzuzhizhetouxiangTap" class="">
                <view>请上传头像</view>
                <image :style='{"border":"0px solid #ccc","width":"200rpx","borderRadius":"16rpx","objectFit":"cover","display":"block","height":"160rpx"}' v-if="ruleForm.touxiang" class="avator" :src="baseUrl+ruleForm.touxiang" mode=""></image>
                <image :style='{"border":"0px solid #ccc","width":"200rpx","borderRadius":"16rpx","objectFit":"cover","display":"block","height":"160rpx"}' v-else class="avator" src="../../static/gen/upload.png" mode=""></image>
            </view>
			<button :style='{"padding":"0px","margin":"40rpx auto 24rpx","borderColor":"#ef6d0d","color":"#333","display":"block","borderRadius":"40rpx","background":"linear-gradient(180deg, rgba(253,246,139,1) 0%, rgba(254,233,97,1) 84%, rgba(255,220,52,1) 100%),#ffdc34","borderWidth":"0 0 8rpx","width":"60%","lineHeight":"80rpx","fontSize":"32rpx","borderStyle":"solid","height":"88rpx"}' class="btn-submit" @tap="register" type="primary">注册</button>
		</view>
	</view>
</view>
</template>

<script>
    import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";
	export default {
		data() {
			return {
                jiazhangxueshengxingbieOptions: [],
                jiazhangxueshengxingbieIndex: 0,
                jiazhangnianjiOptions: [],
                jiazhangnianjiIndex: 0,
                jiazhangvipOptions: [],
                jiazhangvipIndex: 0,
                huodongzuzhizhexingbieOptions: [],
                huodongzuzhizhexingbieIndex: 0,
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
                zhanghao: '',
                xingming: '',
                mima: '',
                xingbie: '',
                nianling: '',
                lianxifangshi: '',
                touxiang: '',
				},
				tableName:""
			}
		},
        components: {
            multipleSelect
        },
        computed: {
            baseUrl() {
                return this.$base.url;
            },
        },
		async onLoad() {
			let res = [];
			let table = uni.getStorageSync("loginTable");
            this.tableName = table;

                        // 自定义下拉框值
			if(this.tableName=='jiazhang'){
                this.jiazhangxueshengxingbieOptions = "男,女".split(',');
				this.ruleForm.xueshengxingbie=this.jiazhangxueshengxingbieOptions[0]
			}
                        // 自定义下拉框值
			if(this.tableName=='jiazhang'){
                this.jiazhangnianjiOptions = "一年级,二年级,三年级,四年级,五年级,六年级".split(',');
				this.ruleForm.nianji=this.jiazhangnianjiOptions[0]
			}
                        // 自定义下拉框值
			if(this.tableName=='huodongzuzhizhe'){
                this.huodongzuzhizhexingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.huodongzuzhizhexingbieOptions[0]
			}
			
			this.styleChange()
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
					// document.querySelectorAll('.uni-input .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.registerFrom.content.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			// 注册
			async register() {
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
				if(`jiazhang` == this.tableName && (this.ruleForm.mima.length<2)){
					this.$utils.msg(`密码长度不能小于2`);
					return
				}
				if(`jiazhang` == this.tableName && (this.ruleForm.mima.length>10)){
					this.$utils.msg(`密码长度不能大于10`);
					return
				}
                if(`jiazhang` == this.tableName && (this.ruleForm.mima!=this.ruleForm.mima2)){
                    this.$utils.msg(`两次密码输入不一致`);
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
				if(`huodongzuzhizhe` == this.tableName && (this.ruleForm.mima.length<2)){
					this.$utils.msg(`密码长度不能小于2`);
					return
				}
				if(`huodongzuzhizhe` == this.tableName && (this.ruleForm.mima.length>10)){
					this.$utils.msg(`密码长度不能大于10`);
					return
				}
                if(`huodongzuzhizhe` == this.tableName && (this.ruleForm.mima!=this.ruleForm.mima2)){
                    this.$utils.msg(`两次密码输入不一致`);
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
				await this.$api.register(`${this.tableName}`, this.ruleForm);
				this.$utils.msgBack('注册成功');;
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
