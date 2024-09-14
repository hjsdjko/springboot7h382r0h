<template>
	<view class="content">
		<view class="box" :style='{"minHeight":"100vh","width":"100%","padding":"200rpx 80rpx 80rpx","background":"url(http://codegen.caihongy.cn/20221221/d43d607ac21d4ea593130b716e7a7795.gif) no-repeat center top / 100% auto,linear-gradient(180deg, rgba(124,210,235,1) 0%, rgba(33,121,222,1) 100%),#2179de","height":"100%"}' v-if="type==1">
			<view :style='{"padding":"60rpx 60rpx","boxShadow":"0px 0px 0px #ddd","borderRadius":"12rpx","background":"none","display":"block","width":"100%","height":"auto"}'>
				<view class="forget-input" :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}'>
					<input v-model="username" :style='{"border":"0px solid rgb(255, 170, 51)","padding":"0px 24rpx","boxShadow":"4rpx 4rpx 0px #2c77cb","margin":"0px","borderColor":"#e9be70","color":"#698fad","borderRadius":"12rpx","background":"#b5d9f4","borderWidth":"0px","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' type="text" placeholder="请输入您的账号" />
				</view>
				<picker :style='{"boxShadow":"4rpx 4rpx 0px #2c77cb","margin":"0 0 40rpx 0","borderColor":"#e9be70","borderRadius":"12rpx","borderWidth":"0px","background":"#b5d9f4","width":"100%","borderStyle":"solid","height":"auto"}' @change="optionsChange" :value="index" :range="options">
					<view class="uni-input" :style='{"width":"100%","padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#666"}'>{{options[index]}}</view>
				</picker>
				<button class="landing" :style='{"padding":"0px","margin":"0 auto 24rpx","borderColor":"#ef6d0d","color":"#333","display":"block","borderRadius":"40rpx","background":"linear-gradient(180deg, rgba(253,246,139,1) 0%, rgba(254,233,97,1) 84%, rgba(255,220,52,1) 100%),#ffdc34","borderWidth":"0 0 8rpx","width":"60%","lineHeight":"80rpx","fontSize":"32rpx","borderStyle":"solid","height":"88rpx"}' @tap="nextClick" type="primary">下一步</button>
			</view>
		</view>
        <view class="box" :style='{"minHeight":"100vh","width":"100%","padding":"200rpx 80rpx 80rpx","background":"url(http://codegen.caihongy.cn/20221221/d43d607ac21d4ea593130b716e7a7795.gif) no-repeat center top / 100% auto,linear-gradient(180deg, rgba(124,210,235,1) 0%, rgba(33,121,222,1) 100%),#2179de","height":"100%"}' v-if="type==2">
            <view :style='{"padding":"60rpx 60rpx","boxShadow":"0px 0px 0px #ddd","borderRadius":"12rpx","background":"none","display":"block","width":"100%","height":"auto"}'>
                <view class="forget-input" :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}'>
                    <input v-model="userForm.pquestion"  :style='{"border":"0px solid rgb(255, 170, 51)","padding":"0px 24rpx","boxShadow":"4rpx 4rpx 0px #2c77cb","margin":"0px","borderColor":"#e9be70","color":"#698fad","borderRadius":"12rpx","background":"#b5d9f4","borderWidth":"0px","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' type="text" placeholder="密保问题" disabled="disabled"/>
                </view>
                <view class="forget-input" :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}'>
                    <input v-model="panswer1" :style='{"border":"0px solid rgb(255, 170, 51)","padding":"0px 24rpx","boxShadow":"4rpx 4rpx 0px #2c77cb","margin":"0px","borderColor":"#e9be70","color":"#698fad","borderRadius":"12rpx","background":"#b5d9f4","borderWidth":"0px","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' type="text" placeholder="密保答案" />
                </view>
                <button class="landing" :style='{"padding":"0px","margin":"0 auto 24rpx","borderColor":"#ef6d0d","color":"#333","display":"block","borderRadius":"40rpx","background":"linear-gradient(180deg, rgba(253,246,139,1) 0%, rgba(254,233,97,1) 84%, rgba(255,220,52,1) 100%),#ffdc34","borderWidth":"0 0 8rpx","width":"60%","lineHeight":"80rpx","fontSize":"32rpx","borderStyle":"solid","height":"88rpx"}' @tap="confirmClick" type="primary">确定</button>
            </view>
        </view>
        <view class="box" :style='{"minHeight":"100vh","width":"100%","padding":"200rpx 80rpx 80rpx","background":"url(http://codegen.caihongy.cn/20221221/d43d607ac21d4ea593130b716e7a7795.gif) no-repeat center top / 100% auto,linear-gradient(180deg, rgba(124,210,235,1) 0%, rgba(33,121,222,1) 100%),#2179de","height":"100%"}' v-if="type==3">
            <view :style='{"padding":"60rpx 60rpx","boxShadow":"0px 0px 0px #ddd","borderRadius":"12rpx","background":"none","display":"block","width":"100%","height":"auto"}'>
                <view class="forget-input" :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}'>
                    <input v-model="password" :style='{"border":"0px solid rgb(255, 170, 51)","padding":"0px 24rpx","boxShadow":"4rpx 4rpx 0px #2c77cb","margin":"0px","borderColor":"#e9be70","color":"#698fad","borderRadius":"12rpx","background":"#b5d9f4","borderWidth":"0px","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' type="password" placeholder="密码" />
                </view>
                <view class="forget-input" :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}'>
                    <input v-model="repassword" :style='{"border":"0px solid rgb(255, 170, 51)","padding":"0px 24rpx","boxShadow":"4rpx 4rpx 0px #2c77cb","margin":"0px","borderColor":"#e9be70","color":"#698fad","borderRadius":"12rpx","background":"#b5d9f4","borderWidth":"0px","width":"100%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' type="password" placeholder="确认密码" />
                </view>
                <button class="landing" :style='{"padding":"0px","margin":"0 auto 24rpx","borderColor":"#ef6d0d","color":"#333","display":"block","borderRadius":"40rpx","background":"linear-gradient(180deg, rgba(253,246,139,1) 0%, rgba(254,233,97,1) 84%, rgba(255,220,52,1) 100%),#ffdc34","borderWidth":"0 0 8rpx","width":"60%","lineHeight":"80rpx","fontSize":"32rpx","borderStyle":"solid","height":"88rpx"}' @tap="updateClick" type="primary">修改密码</button>
            </view>
        </view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				options: [
                    '请选择登录用户类型',
                ],
                optionsValues: [
					'',
				],
				index: 0,
                tableName: '',
                type: 1,
                repassword: '',
                password: '',
                panswer1: '',
                userForm: {
                }
			}
		},
		onLoad() {
			this.styleChange()
		},
		methods: {
			async nextClick() {
				if(this.username==undefined) {
					this.$utils.msg('请输入账号')
					return;
                                }
				if(this.optionsValues[this.index]=="") {
					this.$utils.msg('请选择角色')
                    return;
				}
                this.tableName = this.optionsValues[this.index];
                let res = await this.$api.security(this.tableName,{
                    username: this.username
                })
                if(!res.data) {
                    this.$utils.msg('用户不存在')
                }
                if (res.code == 0) {
                    this.userForm = res.data
                    this.type = 2
                }
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.forget-input .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.restPwFrom.content.input.backgroundColor
					// })
				})
			},
            confirmClick() {
                if (this.userForm.panswer !== this.panswer1) {
                    this.$utils.msg('密保答案不正确')
                    return false
                }
                this.$utils.msg('验证成功')
                this.password = ''
                setTimeout(() => {
                    this.type = 3
                }, 1000)
            },
            async updateClick() {
                if(!this.password) {
                    this.$utils.msg('密码不能为空')
                    return false
                }
                if (this.password != this.repassword) {
                    this.$utils.msg('两次密码输入不一致')
                    return false
                }
                if(this.userForm.mima) {
                    this.userForm.mima=this.password;
                } else {
                    this.userForm.password=this.password;
                }
                await this.$api.update(this.tableName, this.userForm)
                this.$utils.msg('密码修改成功')
                setTimeout(() => {
                    uni.navigateBack({
            
                    })
                }, 1000)
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
