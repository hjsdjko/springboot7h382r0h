(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-center-center"],{"019c":function(e,t,i){"use strict";var n,r=function(){var e=this,t=e.$createElement,i=e._self._c||t;return i("v-uni-view",{staticClass:"content"},[i("v-uni-view",{style:{minHeight:"100vh",padding:"40rpx 0 240rpx",flexWrap:"wrap",background:"url() fixed,#fff",display:"flex",width:"100%",position:"relative",height:"auto"}},[i("v-uni-view",{staticClass:"header",class:{status:e.isH5Plus},style:{padding:"0px 24rpx",boxShadow:"inset 0px 0px 0px 0px #f7dcab",margin:"20rpx auto 160rpx",borderColor:"#e9be70",borderRadius:"0",background:"url(http://codegen.caihongy.cn/20221221/b0090511ebb8453898dc32870d4b5bbd.png) no-repeat center top / 100% 100%,rgba(255,255,255,1)",borderWidth:"0px 0px 0px 0px",display:"flex",width:"calc(100% - 40rpx)",borderStyle:"solid",height:"280rpx",order:"2"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.onPageTap("../user-info/user-info")}}},["jiazhang"==e.tableName?i("v-uni-view",{staticClass:"userinfo",style:{width:"calc(100% - 112rpx)",alignItems:"center",flexWrap:"wrap",background:"none",display:"flex",height:"100%"}},[i("v-uni-image",{style:{padding:"0",margin:"0 0px 0 0",borderRadius:"16rpx",objectFit:"cover",textAlign:"center",background:"#000",width:"30%",height:"60%",order:"2"},attrs:{src:e.user.touxiang?e.baseUrl+e.user.touxiang:"/static/gen/upload.png"}}),i("v-uni-view",{staticClass:"info",style:{width:"70%",flexDirection:"column",justifyContent:"center",display:"flex",height:"100%"}},[i("v-uni-view",{style:{padding:"4rpx 8rpx",borderColor:"#eee",margin:"0 0 0px",color:"#333",borderWidth:"0 0 2rpx",width:"90%",lineHeight:"36rpx",fontSize:"24rpx",borderStyle:"solid"}},[e._v(e._s(e.user.jiazhangzhanghao)),e.user.vip&&"是"==e.user.vip?i("v-uni-text",[e._v("(VIP)")]):e._e()],1)],1)],1):e._e(),"huodongzuzhizhe"==e.tableName?i("v-uni-view",{staticClass:"userinfo",style:{width:"calc(100% - 112rpx)",alignItems:"center",flexWrap:"wrap",background:"none",display:"flex",height:"100%"}},[i("v-uni-view",{staticClass:"info",style:{width:"70%",flexDirection:"column",justifyContent:"center",display:"flex",height:"100%"}},[i("v-uni-view",{style:{padding:"4rpx 8rpx",borderColor:"#eee",margin:"0 0 0px",color:"#333",borderWidth:"0 0 2rpx",width:"90%",lineHeight:"36rpx",fontSize:"24rpx",borderStyle:"solid"}},[e._v(e._s(e.user.zhanghao)),e.user.vip&&"是"==e.user.vip?i("v-uni-text",[e._v("(VIP)")]):e._e()],1)],1)],1):e._e(),i("v-uni-view",{staticClass:"setting",style:{width:"112rpx",alignItems:"center",justifyContent:"center",display:"flex",height:"100%"}},[i("v-uni-view",{staticClass:"cuIcon-settings",style:{border:"0",width:"72rpx",lineHeight:"72rpx",fontSize:"72rpx",color:"#333",borderRadius:"0"}})],1)],1),i("v-uni-view",{staticClass:"list",style:{padding:"0 0px 0px",margin:"0 32rpx",flexWrap:"wrap",background:"none",display:"flex",width:"calc(100% - 64rpx)",height:"auto"}},[e._l(e.menuList,(function(t){return[e._l(t.backMenu,(function(n,r){return e.role==t.roleName?[e._l(n.child,(function(t,n){return["yifahuodingdan"!=t.tableName&&"yituikuandingdan"!=t.tableName&&"yiquxiaodingdan"!=t.tableName&&"weizhifudingdan"!=t.tableName&&"yizhifudingdan"!=t.tableName&&"yiwanchengdingdan"!=t.tableName&&"exampaper"!=t.tableName&&"examquestion"!=t.tableName?i("v-uni-view",{key:n+"_0",staticClass:"li",style:{padding:"0 20rpx 8rpx",boxShadow:"inset 0px 0px 0px 0px #f9edd9",borderColor:"#e9be70",margin:"0 0 20rpx",alignItems:"center",display:"flex",borderRadius:"0",borderWidth:"0px 0px 0px",background:"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8",width:"100%",lineHeight:"72rpx",borderStyle:"solid",height:"88rpx"},attrs:{"hover-class":"hover"},on:{click:function(i){arguments[0]=i=e.$handleEvent(i),e.onPageTap("../"+t.tableName+"/list?userid="+e.user.id+"&menuJump="+t.menuJump)}}},[i("v-uni-view",{class:t.appFrontIcon,style:{width:"64rpx",lineHeight:"64rpx",fontSize:"56rpx",color:"#6195ee"}}),i("v-uni-view",{staticClass:"text",style:{width:"100%",padding:"0 20rpx",lineHeight:"88rpx",fontSize:"28rpx",color:"#333",flex:"1"}},[e._v(e._s(t.menu))]),i("v-uni-view",{staticClass:"cuIcon-right",style:{width:"28rpx",lineHeight:"28rpx",fontSize:"28rpx",color:"#333"}})],1):e._e()]}))]:e._e()}))]})),i("v-uni-view",{staticClass:"li",style:{padding:"0 20rpx 8rpx",boxShadow:"inset 0px 0px 0px 0px #f9edd9",borderColor:"#e9be70",margin:"0 0 20rpx",alignItems:"center",display:"flex",borderRadius:"0",borderWidth:"0px 0px 0px",background:"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8",width:"100%",lineHeight:"72rpx",borderStyle:"solid",height:"88rpx"},attrs:{"hover-class":"hover"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.onPageTap("../shop-recharge/buyvip-confirm")}}},[i("v-uni-view",{staticClass:"cuIcon-people",style:{width:"64rpx",lineHeight:"64rpx",fontSize:"56rpx",color:"#6195ee"}}),i("v-uni-view",{staticClass:"text",style:{width:"100%",padding:"0 20rpx",lineHeight:"88rpx",fontSize:"28rpx",color:"#333",flex:"1"}},[e._v("会员购买")]),i("v-uni-view",{staticClass:"cuIcon-right",style:{width:"28rpx",lineHeight:"28rpx",fontSize:"28rpx",color:"#333"}})],1),i("v-uni-view",{staticClass:"li",style:{padding:"0 20rpx 8rpx",boxShadow:"inset 0px 0px 0px 0px #f9edd9",borderColor:"#e9be70",margin:"0 0 20rpx",alignItems:"center",display:"flex",borderRadius:"0",borderWidth:"0px 0px 0px",background:"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8",width:"100%",lineHeight:"72rpx",borderStyle:"solid",height:"88rpx"},attrs:{"hover-class":"hover"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.onPageTap("../chat/chat")}}},[i("v-uni-view",{staticClass:"cuIcon-service",style:{width:"64rpx",lineHeight:"64rpx",fontSize:"56rpx",color:"#6195ee"}}),i("v-uni-view",{staticClass:"text",style:{width:"100%",padding:"0 20rpx",lineHeight:"88rpx",fontSize:"28rpx",color:"#333",flex:"1"}},[e._v("在线客服")]),i("v-uni-view",{staticClass:"cuIcon-right",style:{width:"28rpx",lineHeight:"28rpx",fontSize:"28rpx",color:"#333"}})],1),i("v-uni-view",{staticClass:"li",style:{padding:"0 20rpx 8rpx",boxShadow:"inset 0px 0px 0px 0px #f9edd9",borderColor:"#e9be70",margin:"0 0 20rpx",alignItems:"center",display:"flex",borderRadius:"0",borderWidth:"0px 0px 0px",background:"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8",width:"100%",lineHeight:"72rpx",borderStyle:"solid",height:"88rpx"},attrs:{"hover-class":"hover"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.onPageTap("../forum-add-or-update/forum-add-or-update")}}},[i("v-uni-view",{staticClass:"cuIcon-scan",style:{width:"64rpx",lineHeight:"64rpx",fontSize:"56rpx",color:"#6195ee"}}),i("v-uni-view",{staticClass:"text",style:{width:"100%",padding:"0 20rpx",lineHeight:"88rpx",fontSize:"28rpx",color:"#333",flex:"1"}},[e._v("我要发贴")]),i("v-uni-view",{staticClass:"cuIcon-right",style:{width:"28rpx",lineHeight:"28rpx",fontSize:"28rpx",color:"#333"}})],1),i("v-uni-view",{staticClass:"li",style:{padding:"0 20rpx 8rpx",boxShadow:"inset 0px 0px 0px 0px #f9edd9",borderColor:"#e9be70",margin:"0 0 20rpx",alignItems:"center",display:"flex",borderRadius:"0",borderWidth:"0px 0px 0px",background:"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8",width:"100%",lineHeight:"72rpx",borderStyle:"solid",height:"88rpx"},attrs:{"hover-class":"hover"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.onPageTap("../forum-my/forum-my")}}},[i("v-uni-view",{staticClass:"cuIcon-scan",style:{width:"64rpx",lineHeight:"64rpx",fontSize:"56rpx",color:"#6195ee"}}),i("v-uni-view",{staticClass:"text",style:{width:"100%",padding:"0 20rpx",lineHeight:"88rpx",fontSize:"28rpx",color:"#333",flex:"1"}},[e._v("我的发贴")]),i("v-uni-view",{staticClass:"cuIcon-right",style:{width:"28rpx",lineHeight:"28rpx",fontSize:"28rpx",color:"#333"}})],1)],2)],1)],1)},o=[];i.d(t,"b",(function(){return r})),i.d(t,"c",(function(){return o})),i.d(t,"a",(function(){return n}))},"27ae":function(e,t,i){"use strict";i.r(t);var n=i("55b4"),r=i.n(n);for(var o in n)"default"!==o&&function(e){i.d(t,e,(function(){return n[e]}))}(o);t["default"]=r.a},"2ecd":function(e,t,i){var n=i("52ce");"string"===typeof n&&(n=[[e.i,n,""]]),n.locals&&(e.exports=n.locals);var r=i("4f06").default;r("45012623",n,!0,{sourceMap:!1,shadowMode:!1})},"52ce":function(e,t,i){var n=i("24fb");t=n(!1),t.push([e.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-014b08f4]{height:calc(100vh - 94px);box-sizing:border-box}',""]),e.exports=t},"55b4":function(e,t,i){"use strict";var n=i("4ea4");Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0,i("96cf");var r=n(i("3b8d")),o=n(i("2971")),a={data:function(){return{isH5Plus:!0,user:{},tableName:"",role:"",menuList:[],iconArr:["cuIcon-same","cuIcon-deliver","cuIcon-evaluate","cuIcon-shop","cuIcon-ticket","cuIcon-cascades","cuIcon-discover","cuIcon-question","cuIcon-pic","cuIcon-filter","cuIcon-footprint","cuIcon-pulldown","cuIcon-pullup","cuIcon-moreandroid","cuIcon-refund","cuIcon-qrcode","cuIcon-remind","cuIcon-profile","cuIcon-home","cuIcon-message","cuIcon-link","cuIcon-lock","cuIcon-unlock","cuIcon-vip","cuIcon-weibo","cuIcon-activity","cuIcon-friendadd","cuIcon-friendfamous","cuIcon-friend","cuIcon-goods","cuIcon-selection"]}},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(){var e=(0,r.default)(regeneratorRuntime.mark((function e(){var t,i,n;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return this.role=uni.getStorageSync("role"),t=uni.getStorageSync("nowTable"),e.next=4,this.$api.session(t);case 4:i=e.sent,this.user=i.data,this.tableName=t,n=o.default.list(),this.menuList=n;case 9:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}(),onShow:function(){var e=(0,r.default)(regeneratorRuntime.mark((function e(){var t,i,n;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return uni.removeStorageSync("useridTag"),this.role=uni.getStorageSync("role"),t=uni.getStorageSync("nowTable"),e.next=5,this.$api.session(t);case 5:i=e.sent,this.user=i.data,this.tableName=t,n=o.default.list(),this.menuList=n;case 10:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}(),methods:{onPageTap:function(e){uni.setStorageSync("useridTag",1),uni.navigateTo({url:e,fail:function(){uni.switchTab({url:e})}})}}};t.default=a},d2c0:function(e,t,i){"use strict";i.r(t);var n=i("019c"),r=i("27ae");for(var o in r)"default"!==o&&function(e){i.d(t,e,(function(){return r[e]}))}(o);i("f740");var a,c=i("f0c5"),s=Object(c["a"])(r["default"],n["b"],n["c"],!1,null,"014b08f4",null,!1,n["a"],a);t["default"]=s.exports},f740:function(e,t,i){"use strict";var n=i("2ecd"),r=i.n(n);r.a}}]);