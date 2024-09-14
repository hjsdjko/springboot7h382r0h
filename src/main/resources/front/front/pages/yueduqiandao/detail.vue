
<template>
<view>
<mescroll-uni @init="mescrollInit" :up="upOption" :down="downOption" @down="downCallback" @up="upCallback">
	<view class="content">
		<view class="container" :style='{"minHeight":"100vh","width":"100%","padding":"0px 0 132rpx","position":"relative","background":"url() fixed,#fff","height":"auto"}'>
						<swiper :style='{"border":"0px dotted #f7de91","boxShadow":"inset 0px 0px 0px 0px #f4ead8","padding":"0px 0 0px ","margin":"0 auto","borderColor":"#87acf1","borderRadius":"0","background":"rgba(255,255,255,1)","borderWidth":"0 12rpx 2rpx 12rpx","width":"calc(100% - 40rpx)","borderStyle":"solid","height":"396rpx"}' class="swiper" :indicator-dots='false' :autoplay='true' :circular='false' indicator-active-color='#000000' indicator-color='rgba(0, 0, 0, .3)' :duration='500' :interval='5000' :vertical='false'>
				<swiper-item :style='{"width":"100%","borderRadius":"0px 0px 10% 10%","background":"none","height":"360rpx"}' v-for="(swiper,index) in swiperList" :key="index">
					<image :style='{"width":"calc(100% - 40rpx)","margin":"16rpx auto","objectFit":"cover","borderRadius":"24rpx","display":"block","height":"360rpx"}' mode="aspectFill" v-if="swiper.substring(0,4)=='http'" :src="swiper"></image>
					<image :style='{"width":"calc(100% - 40rpx)","margin":"16rpx auto","objectFit":"cover","borderRadius":"24rpx","display":"block","height":"360rpx"}' mode="aspectFill" v-else :src="baseUrl+swiper"></image>
				</swiper-item>
			</swiper>
									            <view :style='{"padding":"0px 24rpx 24rpx","flexWrap":"wrap","background":"none","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}' class="detail-content">

				<view :style='{"boxShadow":"inset 0px 0px 0px 0px #f9edd9","padding":"0 0 8rpx","margin":"20rpx 0 20rpx 0","borderColor":"#e9be70","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="detail-list-item title">
					<view :style='{"padding":"0 20rpx 0 0","color":"#333","textAlign":"right","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","minWidth":"188rpx"}' class="lable">签到日期：</view>
					<view :style='{"padding":"0px 20rpx 20rpx 0","margin":"16rpx 0 0","lineHeight":"48rpx","fontSize":"28rpx","color":"rgb(0, 0, 0)"}' class="text">{{detail.qiandaoriqi}}</view>
				</view>

				<view class="detail-list-item" :style='{"boxShadow":"inset 0px 0px 0px 0px #f9edd9","padding":"0 0 8rpx","margin":"20rpx 0 20rpx 0","borderColor":"#e9be70","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"0 20rpx 0 0","color":"#333","textAlign":"right","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","minWidth":"188rpx"}'>签到名称：</view>
					<view  class="text" :style='{"padding":"0px 20rpx 20rpx 0","margin":"16rpx 0 0","lineHeight":"48rpx","fontSize":"28rpx","color":"rgb(0, 0, 0)"}'>{{detail.qiandaomingcheng}}</view>
				</view>
				<view class="detail-list-item" :style='{"boxShadow":"inset 0px 0px 0px 0px #f9edd9","padding":"0 0 8rpx","margin":"20rpx 0 20rpx 0","borderColor":"#e9be70","borderRadius":"0","borderWidth":"0px 0px 0px","background":"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"0 20rpx 0 0","color":"#333","textAlign":"right","width":"auto","lineHeight":"80rpx","fontSize":"28rpx","minWidth":"188rpx"}'>签到备注：</view>
					<view  class="text" :style='{"padding":"0px 20rpx 20rpx 0","margin":"16rpx 0 0","lineHeight":"48rpx","fontSize":"28rpx","color":"rgb(0, 0, 0)"}'>{{detail.qiandaobeizhu}}</view>
				</view>








				<view class="bottom-content bg-white tabbar border shop" :style='{"width":"100%","padding":"20rpx 0px","flexWrap":"wrap","background":"none","display":"flex","height":"auto"}'>

					<button :style='{"border":"0","padding":"0 20rpx","margin":"0","color":"rgb(255, 255, 255)","background":"rgb(255, 170, 51)","width":"auto","fontSize":"28rpx","height":"80rpx"}' v-if="userid&&isAuth('yueduqiandao','签到')" @tap="onAcrossTap('qiandaodaka','','','')" class="cu-btn bg-brown round shadow-blur" >签到</button>
					<button :style='{"border":"0","padding":"0 20rpx","margin":"0","color":"rgb(255, 255, 255)","background":"rgb(255, 170, 51)","width":"auto","fontSize":"28rpx","height":"80rpx"}' v-if="!userid&&isAuthFront('yueduqiandao','签到')" @tap="onAcrossTap('qiandaodaka','','','')" class="cu-btn bg-brown round shadow-blur" >签到</button>
				</view>
			</view>

		</view>
	</view>
</mescroll-uni>
</view>
</template>

<script>
	export default {
		data() {
			return {
				btnColor: ['#409eff','#67c23a','#909399','#e6a23c','#f56c6c','#356c6c','#351c6c','#f093a9','#a7c23a','#104eff','#10441f','#a21233','#503319'],
				id: '',
                userid: '',
				detail: {},
				swiperList: [],
				commentList: [],
				mescroll: null, //mescroll实例对象
				downOption: {
					auto: false //是否在初始化后,自动执行下拉回调callback; 默认true
				},
				upOption: {
					noMoreSize: 3, //如果列表已无数据,可设置列表的总数量要大于半页才显示无更多数据;避免列表数据过少(比如只有一条数据),显示无更多数据会不好看; 默认5
					textNoMore: '~ 没有更多了 ~',
				},
				hasNext: true,
				user: {},
				count: 0,
				timer: null
			}
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},
		},
		async onLoad(options) {
			this.id = options.id;
            if(options.userid) {
                this.userid = options.userid;
            }
			// 渲染数据
			this.init();
		},
        onUnload() {
            if(this.timer) {
                clearInterval(this.timer);
            }
        },
		async onShow(options) {
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			this.btnColor = this.btnColor.sort(()=> {
				return (0.5-Math.random());
			});
			let crossCleanType = uni.getStorageSync('crossCleanType')
            if(crossCleanType) {
				uni.removeStorageSync('crossCleanType')
                res = await this.$api.info('yueduqiandao', this.id);
                this.detail = res.data;
            }
		},
		destroyed: function() {
			//window.clearInterval(this.inter);
		},
		methods: {
			// 支付
			onPayTap(){
				uni.setStorageSync('paytable','yueduqiandao');
				uni.setStorageSync('payObject',this.detail);
				this.$utils.jump('../pay-confirm/pay-confirm?type=1')
			},
            onDetailTap(item) {
                uni.setStorageSync("useridTag",this.userid);
                this.$utils.jump(`./detail?id=${item.id}&userid=`+this.userid)
            },
			// 跨表
			onAcrossTap(tableName,crossOptAudit,statusColumnName,tips,statusColumnValue){
				uni.setStorageSync('crossTable','yueduqiandao');
				uni.setStorageSync(`crossObj`, this.detail);
				uni.setStorageSync(`statusColumnName`, statusColumnName);
				uni.setStorageSync(`statusColumnValue`, statusColumnValue);
				uni.setStorageSync(`tips`, tips);
				if(statusColumnName!=''&&!statusColumnName.startsWith("[")) {
					var obj = uni.getStorageSync('crossObj');
					for (var o in obj){
						if(o==statusColumnName && obj[o]==statusColumnValue){
							this.$utils.msg(tips);
							return
						}
					}
				}
				this.$utils.jump(`../${tableName}/add-or-update?cross=true`);
			},
			// 获取详情
			async init(){
                if(this.timer) {
                    clearInterval(this.timer);
                }
				let res = await this.$api.info('yueduqiandao', this.id);
				this.detail = res.data;
				// 轮播图片
				this.swiperList = this.detail.tupian ? this.detail.tupian.split(",") : [];
			},

			// mescroll组件初始化的回调,可获取到mescroll对象
			mescrollInit(mescroll) {
				this.mescroll = mescroll;
			},

			/*下拉刷新的回调 */
			downCallback(mescroll) {
				this.hasNext = true
				mescroll.resetUpScroll()
			},

			/*上拉加载的回调: mescroll携带page的参数, 其中num:当前页 从1开始, size:每页数据条数,默认10 */
			async upCallback(mescroll) {
				mescroll.endSuccess(mescroll.size, this.hasNext);

            },



			onChatTap() {
				this.$utils.jump('../chat/chat')
			},
			// 下载
			download(url){
				let _this = this;
				url=_this.$base.url +  url;
				uni.downloadFile({
					url: url,
					success: (res) => {
						if (res.statusCode === 200) {
							_this.$utils.msg('下载成功');
							 window.open(url);
						}
					}
				});
			},
			//
			onCartTabTap() {
				this.$utils.tab('../shop-cart/shop-cart')
			},
			// 添加评论
			async onCommentTap() {
				this.$utils.jump(`../discussyueduqiandao/add-or-update?refid=${this.id}`)
			},
			onSHTap() {
				this.$refs.popup.open()
			},
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
	
	.seat-list {
		display: flex;
		align-items: center;
		flex-wrap: wrap;
		background: #FFFFFF;
		margin: 20upx;
		border-radius: 20upx;
		padding: 20upx;
		font-size: 30upx;
		.seat-item {
			width: 33.33%;
			display: flex;
			align-items: center;
			flex-direction: column;
			margin-bottom: 20upx;
	
			.seat-icon {
				width: 50upx;
				height: 50upx;
				margin-bottom: 10upx;
			}
		}
	}
	
	audio {
		display: flex;
		flex-direction: column;
	}
	
	.audio /deep/ .uni-audio-default {
		width: inherit;
	}
</style>
