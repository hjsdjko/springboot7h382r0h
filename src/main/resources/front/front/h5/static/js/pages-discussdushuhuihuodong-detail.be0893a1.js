(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-discussdushuhuihuodong-detail"],{"23bb":function(t,e,i){var n=i("d530");"string"===typeof n&&(n=[[t.i,n,""]]),n.locals&&(t.exports=n.locals);var r=i("4f06").default;r("268abc50",n,!0,{sourceMap:!1,shadowMode:!1})},"3c96":function(t,e,i){"use strict";var n=i("23bb"),r=i.n(n);r.a},6125:function(t,e,i){"use strict";i.r(e);var n=i("aeea"),r=i.n(n);for(var a in n)"default"!==a&&function(t){i.d(e,t,(function(){return n[t]}))}(a);e["default"]=r.a},"6d40":function(t,e,i){"use strict";var n={"mescroll-uni":i("f05e").default},r=function(){var t=this,e=t.$createElement,i=t._self._c||e;return i("v-uni-view",[i("mescroll-uni",{attrs:{up:t.upOption,down:t.downOption},on:{init:function(e){arguments[0]=e=t.$handleEvent(e),t.mescrollInit.apply(void 0,arguments)},down:function(e){arguments[0]=e=t.$handleEvent(e),t.downCallback.apply(void 0,arguments)},up:function(e){arguments[0]=e=t.$handleEvent(e),t.upCallback.apply(void 0,arguments)}}},[i("v-uni-view",{staticClass:"content"},[i("v-uni-view",{staticClass:"container",style:{minHeight:"100vh",width:"100%",padding:"0px 0 132rpx",position:"relative",background:"url() fixed,#fff",height:"auto"}},[i("v-uni-view",{staticClass:"detail-content",style:{padding:"0px 24rpx 24rpx",flexWrap:"wrap",background:"none",display:"flex",width:"100%",justifyContent:"space-between",height:"auto"}},[i("v-uni-view",{staticClass:"detail-list-item",style:{boxShadow:"inset 0px 0px 0px 0px #f9edd9",padding:"0 0 8rpx",margin:"20rpx 0 20rpx 0",borderColor:"#e9be70",borderRadius:"0",borderWidth:"0px 0px 0px",background:"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"lable",style:{padding:"0 20rpx 0 0",color:"#333",textAlign:"right",width:"auto",lineHeight:"80rpx",fontSize:"28rpx",minWidth:"188rpx"}},[t._v("关联表id：")]),i("v-uni-view",{staticClass:"text",style:{padding:"0px 20rpx 20rpx 0",margin:"16rpx 0 0",lineHeight:"48rpx",fontSize:"28rpx",color:"rgb(0, 0, 0)"}},[t._v(t._s(t.detail.refid))])],1),i("v-uni-view",{staticClass:"detail-list-item",style:{margin:"0 0 24rpx 0",borderColor:"#ccc",borderWidth:"0 0 2rpx 0",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[t.detail.avatarurl?i("v-uni-image",{style:{width:"80rpx",borderRadius:"100%",objectFit:"cover",display:"block",height:"80rpx"},attrs:{src:t.baseUrl+t.detail.avatarurl}}):t._e()],1),i("v-uni-view",{staticClass:"detail-list-item",style:{boxShadow:"inset 0px 0px 0px 0px #f9edd9",padding:"0 0 8rpx",margin:"20rpx 0 20rpx 0",borderColor:"#e9be70",borderRadius:"0",borderWidth:"0px 0px 0px",background:"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"lable",style:{padding:"0 20rpx 0 0",color:"#333",textAlign:"right",width:"auto",lineHeight:"80rpx",fontSize:"28rpx",minWidth:"188rpx"}},[t._v("用户名：")]),i("v-uni-view",{staticClass:"text",style:{padding:"0px 20rpx 20rpx 0",margin:"16rpx 0 0",lineHeight:"48rpx",fontSize:"28rpx",color:"rgb(0, 0, 0)"}},[t._v(t._s(t.detail.nickname))])],1),i("v-uni-view",{staticClass:"detail-list-item",style:{boxShadow:"inset 0px 0px 0px 0px #f9edd9",padding:"0 0 8rpx",margin:"20rpx 0 20rpx 0",borderColor:"#e9be70",borderRadius:"0",borderWidth:"0px 0px 0px",background:"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"lable",style:{padding:"0 20rpx 0 0",color:"#333",textAlign:"right",width:"auto",lineHeight:"80rpx",fontSize:"28rpx",minWidth:"188rpx"}},[t._v("评论内容")]),i("v-uni-view",{staticClass:"text",style:{padding:"0px 20rpx 20rpx 0",margin:"16rpx 0 0",lineHeight:"48rpx",fontSize:"28rpx",color:"rgb(0, 0, 0)"}},[t._v(t._s(t.detail.content))])],1),i("v-uni-view",{staticClass:"detail-list-item",style:{boxShadow:"inset 0px 0px 0px 0px #f9edd9",padding:"0 0 8rpx",margin:"20rpx 0 20rpx 0",borderColor:"#e9be70",borderRadius:"0",borderWidth:"0px 0px 0px",background:"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"lable",style:{padding:"0 20rpx 0 0",color:"#333",textAlign:"right",width:"auto",lineHeight:"80rpx",fontSize:"28rpx",minWidth:"188rpx"}},[t._v("回复内容")]),i("v-uni-view",{staticClass:"text",style:{padding:"0px 20rpx 20rpx 0",margin:"16rpx 0 0",lineHeight:"48rpx",fontSize:"28rpx",color:"rgb(0, 0, 0)"}},[t._v(t._s(t.detail.reply))])],1),i("v-uni-view",{staticClass:"time-content",style:{width:"100%",margin:"0 0 24rpx 0",height:"auto"}},[i("v-uni-view",{staticClass:"comoment-header",style:{border:"0px solid #fdd802",boxShadow:"inset 0px 0px 0px 0px #fcf3bf",padding:"0px 20rpx",margin:"0px",borderRadius:"0",background:"linear-gradient(270deg, rgba(195,228,245,1) 0%, rgba(90,142,237,1) 100%),#5a8eed",display:"flex",width:"calc(100% + 0px)",justifyContent:"space-between",height:"auto"}},[i("v-uni-view",{style:{padding:"0px 20rpx",lineHeight:"80rpx",fontSize:"28rpx",color:"#fff"}},[t._v("评论")]),i("v-uni-view",{staticClass:"btn-comment-content",staticStyle:{display:"flex","align-items":"center"},style:{border:"0px solid #64b7ea",padding:"0 12rpx 0 4rpx",margin:"8rpx 0 12rpx ",background:"none",display:"flex"},on:{click:function(e){arguments[0]=e=t.$handleEvent(e),t.onCommentTap.apply(void 0,arguments)}}},[i("v-uni-view",{staticClass:"cuIcon-add",style:{margin:"0px 8rpx 0",lineHeight:"60rpx",fontSize:"28rpx",color:"#fff"}}),i("v-uni-view",{style:{margin:"0px 0 0",lineHeight:"60rpx",fontSize:"28rpx",color:"#fff"}},[t._v("添加评论")])],1)],1),t._l(t.commentList,(function(e,n){return i("v-uni-view",{key:n,staticClass:"cu-item comment-item",style:{padding:"24rpx 24rpx 40rpx",boxShadow:"inset 0px 0px 0px 0px #f9edd9",margin:"32rpx 0 32rpx",borderColor:"#e9be70",borderRadius:"0",background:"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8",borderWidth:"0px 0px 0px",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{style:{width:"100%",display:"flex",height:"auto"}},[e.avatarurl?i("v-uni-image",{style:{width:"60rpx",margin:"0 8rpx 0 0",borderRadius:"100%",display:"block",height:"60rpx"},attrs:{mode:"aspectFill",src:t.baseUrl+e.avatarurl}}):t._e(),i("v-uni-view",{staticClass:"text-grey",style:{color:"#333",lineHeight:"60rpx",fontSize:"28rpx"}},[t._v(t._s(e.nickname))])],1),i("v-uni-view",{staticClass:"text-gray text-content text-df",style:{margin:"8rpx 0",lineHeight:"1.5",fontSize:"28rpx",color:"#666",textIndent:"2em"}},[t._v(t._s(e.content))]),i("v-uni-view",{staticClass:"margin-top-sm text-gray text-df",style:{lineHeight:"24rpx",fontSize:"24rpx",color:"#666",textAlign:"right"}},[t._v(t._s(e.addtime))]),e.reply?i("v-uni-view",{staticClass:"text-gray text-content text-df",style:{margin:"8rpx 0",lineHeight:"1.5",fontSize:"28rpx",color:"#666",textIndent:"2em"}},[t._v("回复:"+t._s(e.reply))]):t._e()],1)}))],2),i("v-uni-view",{staticClass:"bottom-content bg-white tabbar border shop",style:{width:"100%",padding:"20rpx 0px",flexWrap:"wrap",background:"none",display:"flex",height:"auto"}})],1)],1)],1)],1)],1)},a=[];i.d(e,"b",(function(){return r})),i.d(e,"c",(function(){return a})),i.d(e,"a",(function(){return n}))},aeea:function(t,e,i){"use strict";var n=i("4ea4");Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0,i("f559"),i("55dd"),i("96cf");var r=n(i("3b8d")),a={data:function(){return{btnColor:["#409eff","#67c23a","#909399","#e6a23c","#f56c6c","#356c6c","#351c6c","#f093a9","#a7c23a","#104eff","#10441f","#a21233","#503319"],id:"",userid:"",detail:{},swiperList:[],commentList:[],mescroll:null,downOption:{auto:!1},upOption:{noMoreSize:3,textNoMore:"~ 没有更多了 ~"},hasNext:!0,user:{},count:0,timer:null}},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(){var t=(0,r.default)(regeneratorRuntime.mark((function t(e){return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:this.id=e.id,e.userid&&(this.userid=e.userid),this.init();case 3:case"end":return t.stop()}}),t,this)})));function e(e){return t.apply(this,arguments)}return e}(),onUnload:function(){this.timer&&clearInterval(this.timer)},onShow:function(){var t=(0,r.default)(regeneratorRuntime.mark((function t(e){var i,n,r,a;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return i=uni.getStorageSync("nowTable"),t.next=3,this.$api.session(i);case 3:if(n=t.sent,this.user=n.data,this.btnColor=this.btnColor.sort((function(){return.5-Math.random()})),r=uni.getStorageSync("discussdiscussdushuhuihuodongCleanType"),r&&(uni.removeStorageSync("discussdiscussdushuhuihuodongCleanType"),this.mescroll.num=1,this.upCallback(this.mescroll)),a=uni.getStorageSync("crossCleanType"),!a){t.next=15;break}return uni.removeStorageSync("crossCleanType"),t.next=13,this.$api.info("discussdushuhuihuodong",this.id);case 13:n=t.sent,this.detail=n.data;case 15:case"end":return t.stop()}}),t,this)})));function e(e){return t.apply(this,arguments)}return e}(),destroyed:function(){},methods:{onPayTap:function(){uni.setStorageSync("paytable","discussdushuhuihuodong"),uni.setStorageSync("payObject",this.detail),this.$utils.jump("../pay-confirm/pay-confirm?type=1")},onDetailTap:function(t){uni.setStorageSync("useridTag",this.userid),this.$utils.jump("./detail?id=".concat(t.id,"&userid=")+this.userid)},onAcrossTap:function(t,e,i,n,r){if(uni.setStorageSync("crossTable","discussdushuhuihuodong"),uni.setStorageSync("crossObj",this.detail),uni.setStorageSync("statusColumnName",i),uni.setStorageSync("statusColumnValue",r),uni.setStorageSync("tips",n),""!=i&&!i.startsWith("[")){var a=uni.getStorageSync("crossObj");for(var s in a)if(s==i&&a[s]==r)return void this.$utils.msg(n)}this.$utils.jump("../".concat(t,"/add-or-update?cross=true"))},init:function(){var t=(0,r.default)(regeneratorRuntime.mark((function t(){var e;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return this.timer&&clearInterval(this.timer),t.next=3,this.$api.info("discussdushuhuihuodong",this.id);case 3:e=t.sent,this.detail=e.data;case 5:case"end":return t.stop()}}),t,this)})));function e(){return t.apply(this,arguments)}return e}(),mescrollInit:function(t){this.mescroll=t},downCallback:function(t){this.hasNext=!0,t.resetUpScroll()},upCallback:function(){var t=(0,r.default)(regeneratorRuntime.mark((function t(e){var i;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return t.next=2,this.$api.list("discussdiscussdushuhuihuodong",{page:e.num,limit:10,refid:this.id});case 2:i=t.sent,1==e.num&&(this.commentList=[]),this.commentList=this.commentList.concat(i.data.list),0==i.data.list.length&&(this.hasNext=!1),e.endSuccess(e.size,this.hasNext);case 7:case"end":return t.stop()}}),t,this)})));function e(e){return t.apply(this,arguments)}return e}(),onChatTap:function(){this.$utils.jump("../chat/chat")},download:function(t){var e=this;t=e.$base.url+t,uni.downloadFile({url:t,success:function(i){200===i.statusCode&&(e.$utils.msg("下载成功"),window.open(t))}})},onCartTabTap:function(){this.$utils.tab("../shop-cart/shop-cart")},onCommentTap:function(){var t=(0,r.default)(regeneratorRuntime.mark((function t(){return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:this.$utils.jump("../discussdiscussdushuhuihuodong/add-or-update?refid=".concat(this.id));case 1:case"end":return t.stop()}}),t,this)})));function e(){return t.apply(this,arguments)}return e}(),onSHTap:function(){this.$refs.popup.open()}}};e.default=a},af62:function(t,e,i){"use strict";i.r(e);var n=i("6d40"),r=i("6125");for(var a in r)"default"!==a&&function(t){i.d(e,t,(function(){return r[t]}))}(a);i("3c96");var s,o=i("f0c5"),d=Object(o["a"])(r["default"],n["b"],n["c"],!1,null,"65c0b3ab",null,!1,n["a"],s);e["default"]=d.exports},d530:function(t,e,i){var n=i("24fb");e=n(!1),e.push([t.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-65c0b3ab]{min-height:calc(100vh - 44px);box-sizing:border-box}.seat-list[data-v-65c0b3ab]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-flex-wrap:wrap;flex-wrap:wrap;background:#fff;margin:%?20?%;border-radius:%?20?%;padding:%?20?%;font-size:%?30?%}.seat-list .seat-item[data-v-65c0b3ab]{width:33.33%;display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-align:center;-webkit-align-items:center;align-items:center;-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;flex-direction:column;margin-bottom:%?20?%}.seat-list .seat-item .seat-icon[data-v-65c0b3ab]{width:%?50?%;height:%?50?%;margin-bottom:%?10?%}uni-audio[data-v-65c0b3ab]{display:-webkit-box;display:-webkit-flex;display:flex;-webkit-box-orient:vertical;-webkit-box-direction:normal;-webkit-flex-direction:column;flex-direction:column}.audio[data-v-65c0b3ab] .uni-audio-default{width:inherit}',""]),t.exports=e}}]);