<template>
	<view class="content">
		<view :style='{"minHeight":"100vh","padding":"40rpx 0 240rpx","flexWrap":"wrap","background":"url() fixed,#fff","display":"flex","width":"100%","position":"relative","height":"auto"}'>
			<view :style='{"padding":"0px 24rpx","boxShadow":"inset 0px 0px 0px 0px #f7dcab","margin":"20rpx auto 160rpx","borderColor":"#e9be70","borderRadius":"0","background":"url(http://codegen.caihongy.cn/20221221/b0090511ebb8453898dc32870d4b5bbd.png) no-repeat center top / 100% 100%,rgba(255,255,255,1)","borderWidth":"0px 0px 0px 0px","display":"flex","width":"calc(100% - 40rpx)","borderStyle":"solid","height":"280rpx","order":"2"}' @tap="onPageTap('../user-info/user-info')" class="header" v-bind:class="{'status':isH5Plus}">
				<view :style='{"width":"calc(100% - 112rpx)","alignItems":"center","flexWrap":"wrap","background":"none","display":"flex","height":"100%"}' v-if="tableName=='jiazhang'" class="userinfo">
					<image :style='{"padding":"0","margin":"0 0px 0 0","borderRadius":"16rpx","objectFit":"cover","textAlign":"center","background":"#000","width":"30%","height":"60%","order":"2"}' :src="user.touxiang?baseUrl+user.touxiang:'/static/gen/upload.png'"></image>
					<view :style='{"width":"70%","flexDirection":"column","justifyContent":"center","display":"flex","height":"100%"}' class="info">
						<view :style='{"padding":"4rpx 8rpx","borderColor":"#eee","margin":"0 0 0px","color":"#333","borderWidth":"0 0 2rpx","width":"90%","lineHeight":"36rpx","fontSize":"24rpx","borderStyle":"solid"}'>{{user.jiazhangzhanghao}}<text v-if="user.vip&& user.vip=='是'">(VIP)</text></view>
					</view>
				</view>
				<view :style='{"width":"calc(100% - 112rpx)","alignItems":"center","flexWrap":"wrap","background":"none","display":"flex","height":"100%"}' v-if="tableName=='huodongzuzhizhe'" class="userinfo">
					<view :style='{"width":"70%","flexDirection":"column","justifyContent":"center","display":"flex","height":"100%"}' class="info">
						<view :style='{"padding":"4rpx 8rpx","borderColor":"#eee","margin":"0 0 0px","color":"#333","borderWidth":"0 0 2rpx","width":"90%","lineHeight":"36rpx","fontSize":"24rpx","borderStyle":"solid"}'>{{user.zhanghao}}<text v-if="user.vip&& user.vip=='是'">(VIP)</text></view>
					</view>
				</view>
				<view :style='{"width":"112rpx","alignItems":"center","justifyContent":"center","display":"flex","height":"100%"}' class="setting">
					<view :style='{"border":"0","width":"72rpx","lineHeight":"72rpx","fontSize":"72rpx","color":"#333","borderRadius":"0"}' class="cuIcon-settings"></view>
				</view>
			</view>
		
		
			<view :style='{"padding":"0 0px 0px","margin":"0 32rpx","flexWrap":"wrap","background":"none","display":"flex","width":"calc(100% - 64rpx)","height":"auto"}' class="list">

				<block v-for="item in menuList" v-bind:key="item.roleName">
					<block v-if="role==item.roleName" v-bind:key="index" v-for=" (menu,index) in item.backMenu">
						<block v-bind:key="sort" v-for=" (child,sort) in menu.child">
							<view :style='{"padding":"0 20rpx 8rpx","boxShadow":"inset 0px 0px 0px 0px #f9edd9","borderColor":"#e9be70","margin":"0 0 20rpx","alignItems":"center","display":"flex","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","width":"100%","lineHeight":"72rpx","borderStyle":"solid","height":"88rpx"}' v-if="child.tableName!='yifahuodingdan' && child.tableName!='yituikuandingdan' &&child.tableName!='yiquxiaodingdan' && child.tableName!='weizhifudingdan' && child.tableName!='yizhifudingdan' && child.tableName!='yiwanchengdingdan' && child.tableName!='exampaper' && child.tableName!='examquestion' " @tap="onPageTap('../'+child.tableName+'/list?userid='+user.id+'&menuJump='+child.menuJump)" class="li" hover-class="hover">
								<view v-if="true" :style='{"width":"64rpx","lineHeight":"64rpx","fontSize":"56rpx","color":"#6195ee"}' :class="child.appFrontIcon"></view>
								<view :style='{"width":"100%","padding":"0 20rpx","lineHeight":"88rpx","fontSize":"28rpx","color":"#333","flex":"1"}' class="text">{{child.menu}}</view>
								<view v-if="true" :style='{"width":"28rpx","lineHeight":"28rpx","fontSize":"28rpx","color":"#333"}' class="cuIcon-right"></view>
							</view>
						</block>
					</block>
				</block>

				<view @tap="onPageTap('../shop-recharge/buyvip-confirm')" :style='{"padding":"0 20rpx 8rpx","boxShadow":"inset 0px 0px 0px 0px #f9edd9","borderColor":"#e9be70","margin":"0 0 20rpx","alignItems":"center","display":"flex","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","width":"100%","lineHeight":"72rpx","borderStyle":"solid","height":"88rpx"}' class="li" hover-class="hover">
					<view v-if="true" :style='{"width":"64rpx","lineHeight":"64rpx","fontSize":"56rpx","color":"#6195ee"}' class="cuIcon-people"></view>
					<view class="text" :style='{"width":"100%","padding":"0 20rpx","lineHeight":"88rpx","fontSize":"28rpx","color":"#333","flex":"1"}'>会员购买</view>
					<view v-if="true" :style='{"width":"28rpx","lineHeight":"28rpx","fontSize":"28rpx","color":"#333"}' class="cuIcon-right"></view>
				</view>
				<view @tap="onPageTap('../chat/chat')" :style='{"padding":"0 20rpx 8rpx","boxShadow":"inset 0px 0px 0px 0px #f9edd9","borderColor":"#e9be70","margin":"0 0 20rpx","alignItems":"center","display":"flex","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","width":"100%","lineHeight":"72rpx","borderStyle":"solid","height":"88rpx"}' class="li" hover-class="hover">
					<view v-if="true" :style='{"width":"64rpx","lineHeight":"64rpx","fontSize":"56rpx","color":"#6195ee"}' class="cuIcon-service"></view>
					<view class="text" :style='{"width":"100%","padding":"0 20rpx","lineHeight":"88rpx","fontSize":"28rpx","color":"#333","flex":"1"}'>在线客服</view>
					<view v-if="true" :style='{"width":"28rpx","lineHeight":"28rpx","fontSize":"28rpx","color":"#333"}' class="cuIcon-right"></view>
				</view>
				<view @tap="onPageTap('../forum-add-or-update/forum-add-or-update')" :style='{"padding":"0 20rpx 8rpx","boxShadow":"inset 0px 0px 0px 0px #f9edd9","borderColor":"#e9be70","margin":"0 0 20rpx","alignItems":"center","display":"flex","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","width":"100%","lineHeight":"72rpx","borderStyle":"solid","height":"88rpx"}' class="li"
				 hover-class="hover">
					<view v-if="true" :style='{"width":"64rpx","lineHeight":"64rpx","fontSize":"56rpx","color":"#6195ee"}' class="cuIcon-scan"></view>
					<view class="text" :style='{"width":"100%","padding":"0 20rpx","lineHeight":"88rpx","fontSize":"28rpx","color":"#333","flex":"1"}'>我要发贴</view>
					<view v-if="true" :style='{"width":"28rpx","lineHeight":"28rpx","fontSize":"28rpx","color":"#333"}' class="cuIcon-right"></view>
				</view>
				<view @tap="onPageTap('../forum-my/forum-my')" :style='{"padding":"0 20rpx 8rpx","boxShadow":"inset 0px 0px 0px 0px #f9edd9","borderColor":"#e9be70","margin":"0 0 20rpx","alignItems":"center","display":"flex","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","width":"100%","lineHeight":"72rpx","borderStyle":"solid","height":"88rpx"}' class="li"
				 hover-class="hover">
					<view v-if="true" :style='{"width":"64rpx","lineHeight":"64rpx","fontSize":"56rpx","color":"#6195ee"}' class="cuIcon-scan"></view>
					<view class="text" :style='{"width":"100%","padding":"0 20rpx","lineHeight":"88rpx","fontSize":"28rpx","color":"#333","flex":"1"}'>我的发贴</view>
					<view v-if="true" :style='{"width":"28rpx","lineHeight":"28rpx","fontSize":"28rpx","color":"#333"}' class="cuIcon-right"></view>
				</view>

			</view>
		</view>
	</view>
</template>
<script>
	import menu from '@/utils/menu'
	export default {
		data() {
			return {
				isH5Plus: true,
				user: {},
				tableName:'',
				role: '',
				menuList: [],
        iconArr: [
          'cuIcon-same',
          'cuIcon-deliver',
          'cuIcon-evaluate',
          'cuIcon-shop',
          'cuIcon-ticket',
          'cuIcon-cascades',
          'cuIcon-discover',
          'cuIcon-question',
          'cuIcon-pic',
          'cuIcon-filter',
          'cuIcon-footprint',
          'cuIcon-pulldown',
          'cuIcon-pullup',
          'cuIcon-moreandroid',
          'cuIcon-refund',
          'cuIcon-qrcode',
          'cuIcon-remind',
          'cuIcon-profile',
          'cuIcon-home',
          'cuIcon-message',
          'cuIcon-link',
          'cuIcon-lock',
          'cuIcon-unlock',
          'cuIcon-vip',
          'cuIcon-weibo',
          'cuIcon-activity',
          'cuIcon-friendadd',
          'cuIcon-friendfamous',
          'cuIcon-friend',
          'cuIcon-goods',
          'cuIcon-selection'
        ],
			};
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			}
		},
		async onLoad(){
			this.role = uni.getStorageSync("role");
			let table = uni.getStorageSync("nowTable");
			let res = await this.$api.session(table);
			this.user = res.data;
			this.tableName = table;
			let menus = menu.list();
			this.menuList = menus;
		},
		async onShow(){
            uni.removeStorageSync("useridTag");
			this.role = uni.getStorageSync("role");
			let table = uni.getStorageSync("nowTable");
			let res = await this.$api.session(table);
			this.user = res.data;
			this.tableName = table;
			let menus = menu.list();
			this.menuList = menus;
		},
		methods: {
			onPageTap(url) {
                uni.setStorageSync("useridTag",1);
				uni.navigateTo({
					url: url,
					fail: function() {
						uni.switchTab({
							url: url
						});
					}
				});
			}
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		height: calc(100vh - 94px);
		box-sizing: border-box;
	}
</style>
