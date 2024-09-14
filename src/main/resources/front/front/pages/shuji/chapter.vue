<template>
	<view @touchstart="touchStart" @touchend="touchEnd">
		<view class="title">
			{{detail.chaptertitle}}
		</view>
		<view class="content">
			<rich-text :nodes="detail.content"></rich-text>
		</view>
		<view class="btn">
			<button @click="prepClick" type="primary">上一章</button>
			<button @click="backClick" type="warn">目录</button>
			<button @click="nextClick" type="primary">下一章</button>
		</view>
	</view>
</template>
<script>
	export default {
		data() {
			return {
				detail: {},
				id: '',
				refid: '',
				list: []
			}
		},
		async onLoad(options) {
			this.id = options.id;
			this.refid = options.refid
			this.init()
			this.getList()
		},
		methods: {
            /**
             * 触摸开始
             * @param {Object} e
             */
            touchStart: function(e) {
                if (e.touches.length == 1) {
                    //设置触摸起始点水平方向位置
                    this.startX = e.touches[0].clientX;
                }
            },
            /**
             * 触摸结束
             * @param {Object} e
             */
            touchEnd: function(e) {
                if (e.changedTouches.length == 1) {
                    //手指移动结束后水平位置
                    var endX = e.changedTouches[0].clientX;
                    let diff = endX - this.startX;
                    if (Math.abs(diff) > 20) {
                        if (diff > 0) {
                            this.prepClick()

                        } else {
                            this.nextClick()
                        }
                    }
                }

            },
			async init() {
				console.log(this.id)
				let res = await this.$api.info('chaptershuji', this.id)
				this.detail = res.data;
				this.detail.content = this.detail.content.replace(/<img/g, '<img style="width: 100%;"');
				uni.pageScrollTo({
					scrollTop: 0,
					duration: 100,
				})
			},
			async getList() {

				let res = await this.$api.list('chaptershuji', {
					refid: this.refid,
					limit: 1000
				})
				this.list = res.data.list
			},
			prepClick() {
				for (let x in this.list) {
					if (this.list[x].id == this.id) {
						if (x == 0) {
							this.$utils.msg('已经是第一章了');
							return false
						} else {
							this.id = this.list[Number(x) - 1].id
							this.init()
							break
						}
					}
				}
			},
			backClick() {
				uni.navigateBack({

				})
			},
			nextClick() {
				for (let x in this.list) {
					if (this.list[x].id == this.id) {
						if (x == this.list.length - 1) {
							this.$utils.msg('已经是最后一章了');
							return false
						} else {
							if(this.list[Number(x) + 1].vipread == '是' && uni.getStorageSync("vip")!='是') {
								this.$utils.msg('下一章为vip章节，请购买会员后阅读!');
								return false
							} else {
								this.id = this.list[Number(x) + 1].id
								this.init()
								break
							}
						}
					}
				}
			},
		}
	}
</script>

<style scoped lang="scss">
	page {
		background: #FFFFFF;
	}

	.title {
		text-align: center;
		font-size: 40upx;
		font-weight: bold;
		margin: 20upx;
	}

	.content {
		margin: 40upx 40upx 100upx;
		font-size: 30upx;
		line-height: 50upx;
		letter-spacing: 5upx;
		padding-bottom: 80upx;
	}

	.btn {
		background: #fff;
		display: flex;
		align-items: center;
		position: fixed;
		bottom: 0;
		width: 100%;
		left: 0;
		padding: 10rpx 0;
		box-shadow: 0 -2px 10px 0 rgba(0,0,0,.1);
		button {
			font-size: 26upx;
		}
	}
</style>
