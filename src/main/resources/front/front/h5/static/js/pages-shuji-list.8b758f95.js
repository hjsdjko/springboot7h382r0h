(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-shuji-list"],{1055:function(e,t,i){var n=i("24fb");t=n(!1),t.push([e.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-7a54a620]{min-height:calc(100vh - 44px);box-sizing:border-box}.category-one .tab[data-v-7a54a620]{cursor:pointer;padding:0 %?20?% %?24?%;margin:0 %?8?%;color:#333;display:inline-block;font-size:%?28?%;border-color:#069ffa;line-height:%?160?%;border-radius:0;background:url(http://codegen.caihongy.cn/20221220/f084fc07fcb643b8b92acdba4752de67.png) no-repeat 0 0,url(http://codegen.caihongy.cn/20221220/1e7abd511d1147b8afeb6858d54a7aef.png) no-repeat 100% 0,url(http://codegen.caihongy.cn/20221220/d9457110e9a34ee49c5994b567d884a9.png) repeat-x;width:auto;border-width:0;border-style:solid;text-align:center;min-width:%?126?%;height:%?122?%}.category-one .tab.active[data-v-7a54a620]{cursor:pointer;padding:0 %?20?%;margin:0 %?8?%;color:#333;font-weight:600;display:inline-block;font-size:%?28?%;border-color:#069ffa;line-height:%?160?%;border-radius:0;background:url(http://codegen.caihongy.cn/20221220/f084fc07fcb643b8b92acdba4752de67.png) no-repeat 0 0,url(http://codegen.caihongy.cn/20221220/1e7abd511d1147b8afeb6858d54a7aef.png) no-repeat 100% 0,url(http://codegen.caihongy.cn/20221220/d9457110e9a34ee49c5994b567d884a9.png) repeat-x;width:auto;border-width:0 0 0;border-style:solid;text-align:center;min-width:%?126?%;height:%?122?%}.category-two .tab[data-v-7a54a620]{cursor:pointer;padding:0;color:#555;background:url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x 0 100%,#d7eff8;display:inline-block;width:100%;font-size:%?28?%;line-height:%?68?%;text-align:center;height:%?80?%}.category-two .tab.active[data-v-7a54a620]{cursor:pointer;background-color:#84cef8;padding:0;color:#fff;background:url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x 0 100%,#84cef8;font-weight:600;display:inline-block;width:100%;font-size:%?28?%;line-height:%?74?%;text-align:center;height:%?80?%}.category-three .tab[data-v-7a54a620]{cursor:pointer;padding:0;color:#fff;background:#deb887;display:inline-block;width:100%;font-size:%?28?%;line-height:%?80?%;text-align:center}.category-three .tab.active[data-v-7a54a620]{cursor:pointer;padding:0;color:#fff;background:#000;display:inline-block;width:100%;font-size:%?28?%;line-height:%?80?%;text-align:center}',""]),e.exports=t},"923f":function(e,t,i){"use strict";var n={"mescroll-uni":i("f05e").default},r=function(){var e=this,t=e.$createElement,i=e._self._c||t;return i("mescroll-uni",{attrs:{up:e.upOption,down:e.downOption},on:{init:function(t){arguments[0]=t=e.$handleEvent(t),e.mescrollInit.apply(void 0,arguments)},down:function(t){arguments[0]=t=e.$handleEvent(t),e.downCallback.apply(void 0,arguments)},up:function(t){arguments[0]=t=e.$handleEvent(t),e.upCallback.apply(void 0,arguments)}}},[i("v-uni-view",{staticClass:"content"},[i("v-uni-view",{style:{padding:"0",alignItems:"flex-start",flexWrap:"wrap",background:"url() fixed,#fff",display:"flex",width:"100%",position:"relative",justifyContent:"space-between",height:"auto"}},[i("v-uni-view",{staticClass:"cu-bar bg-white search",staticStyle:{width:"100%"},style:[{top:e.CustomBar+"px"}]},[e.queryList.length>1?i("v-uni-picker",{staticStyle:{"padding-left":"20upx"},attrs:{mode:"selector",range:e.queryList,"range-key":"queryName",value:e.queryIndex},on:{change:function(t){arguments[0]=t=e.$handleEvent(t),e.queryChange.apply(void 0,arguments)}}},[i("v-uni-view",[i("v-uni-image",{staticStyle:{width:"20upx",height:"33upx"},attrs:{src:"../../static/center/to.png"}})],1)],1):e._e(),0==e.queryIndex?i("v-uni-view",{staticClass:"search-form round"},[i("v-uni-text",{staticClass:"cuIcon-search"}),i("v-uni-input",{attrs:{type:"text",placeholder:"书籍编号"},model:{value:e.searchForm.shujibianhao,callback:function(t){e.$set(e.searchForm,"shujibianhao",t)},expression:"searchForm.shujibianhao"}})],1):e._e(),1==e.queryIndex?i("v-uni-view",{staticClass:"search-form round"},[i("v-uni-text",{staticClass:"cuIcon-search"}),i("v-uni-input",{attrs:{type:"text",placeholder:"书籍名称"},model:{value:e.searchForm.shujimingcheng,callback:function(t){e.$set(e.searchForm,"shujimingcheng",t)},expression:"searchForm.shujimingcheng"}})],1):e._e(),i("v-uni-view",{staticClass:"action"},[i("v-uni-button",{staticClass:"cu-btn shadow-blur round",on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.search.apply(void 0,arguments)}}},[e._v("搜索")])],1)],1),i("v-uni-view",{style:{width:"100%",alignItems:"flex-start",flexWrap:"wrap",background:"none",display:"flex",height:"auto"}},[i("v-uni-scroll-view",{staticClass:"category-two",style:{minHeight:"100vh",width:"168rpx",background:"#d7eff8",height:"100%"},attrs:{"scroll-y":"true"}},e._l(e.categoryList,(function(t,n){return i("v-uni-view",{key:n,staticClass:"tab",class:e.categoryName===t.shujileixing?"active":"",on:{click:function(i){arguments[0]=i=e.$handleEvent(i),e.categoryClick(t.shujileixing)}}},[e._v(e._s(t.shujileixing))])})),1),i("v-uni-view",{staticClass:"uni-product-list",style:{padding:"0px 24rpx 24rpx",margin:"24rpx 0 0",flexWrap:"wrap",background:"none",flex:"1",display:"flex",width:"calc(100% - 168rpx)",justifyContent:"space-between",height:"auto"}},e._l(e.list,(function(t,n){return i("v-uni-view",{key:n,staticClass:"uni-product",style:{padding:"0px",boxShadow:"0 8rpx 0px #87acf1",margin:"0 0 40rpx",borderColor:"#e9be70",display:"flex",borderRadius:"0px",flexWrap:"wrap",borderWidth:"0px 0px 0px",background:"rgba(255,255,255,1)",width:"100%",position:"relative",borderStyle:"solid",height:"auto"},on:{click:function(i){arguments[0]=i=e.$handleEvent(i),e.onDetailTap(t)}}},[i("v-uni-view",{staticClass:"uni-product-title",style:{padding:"4rpx 20rpx",margin:"0 0 8rpx",whiteSpace:"nowrap",overflow:"hidden",color:"#333",borderRadius:"20%",textAlign:"center",background:"none",width:"96%",lineHeight:"48rpx",fontSize:"28rpx",textOverflow:"ellipsis"}},[e._v(e._s(t.shujimingcheng))]),e.preHttp(t.tupian)?i("v-uni-image",{staticClass:"uni-product-image",style:{padding:"0",margin:"8rpx auto 8rpx",objectFit:"cover",borderRadius:"24rpx",display:"block",width:"100%",height:"240rpx",order:"1"},attrs:{mode:"aspectFill",src:t.tupian.split(",")[0]}}):i("v-uni-image",{staticClass:"uni-product-image",style:{padding:"0",margin:"8rpx auto 8rpx",objectFit:"cover",borderRadius:"24rpx",display:"block",width:"100%",height:"240rpx",order:"1"},attrs:{mode:"aspectFill",src:t.tupian?e.baseUrl+t.tupian.split(",")[0]:""}}),i("v-uni-view",{staticClass:"uni-product-title",style:{padding:"4rpx 20rpx",margin:"0 0 8rpx",whiteSpace:"nowrap",overflow:"hidden",color:"#333",borderRadius:"20%",textAlign:"center",background:"none",width:"96%",lineHeight:"48rpx",fontSize:"28rpx",textOverflow:"ellipsis"}},[e._v(e._s(t.shujileixing))]),i("v-uni-view",{staticClass:"uni-product-title",style:{padding:"4rpx 20rpx",margin:"0 0 8rpx",whiteSpace:"nowrap",overflow:"hidden",color:"#333",borderRadius:"20%",textAlign:"center",background:"none",width:"96%",lineHeight:"48rpx",fontSize:"28rpx",textOverflow:"ellipsis"}},[e._v(e._s(t.zuozhe))]),i("v-uni-view",{style:{width:"100%",padding:"8rpx 20rpx",justifyContent:"space-between",display:"flex",height:"auto",order:"5"}},[e.userid&&e.isAuth("shuji","修改")||!e.userid&&e.isAuthFront("shuji","修改")?i("v-uni-view",{style:{display:"flex"},on:{click:function(i){i.stopPropagation(),arguments[0]=i=e.$handleEvent(i),e.onUpdateTap(t.id)}}},[i("v-uni-text",{staticClass:"cuIcon-edit",style:{margin:"0 8rpx 0 0",fontSize:"28rpx",lineHeight:"1",color:"#666",display:"inline-block"}}),i("v-uni-text",{style:{fontSize:"28rpx",lineHeight:"1",color:"#666",display:"inline-block"}},[e._v("修改")])],1):e._e(),e.userid&&e.isAuth("shuji","删除")||!e.userid&&e.isAuthFront("shuji","删除")?i("v-uni-view",{style:{display:"flex"},on:{click:function(i){i.stopPropagation(),arguments[0]=i=e.$handleEvent(i),e.onDeleteTap(t.id)}}},[i("v-uni-text",{staticClass:"cuIcon-delete",style:{margin:"0 8rpx 0 0",fontSize:"28rpx",lineHeight:"1",color:"#666",display:"inline-block"}}),i("v-uni-text",{style:{fontSize:"28rpx",lineHeight:"1",color:"#666",display:"inline-block"}},[e._v("删除")])],1):e._e()],1)],1)})),1)],1)],1),e.userid&&e.isAuth("shuji","新增")?i("v-uni-button",{staticClass:"add-btn",style:{border:"2rpx solid #fff",cursor:"pointer",boxShadow:"0 4rpx 8rpx rgba(0,0,0,.3)",color:"#fff",textAlign:"center",bottom:"160rpx",right:"128rpx",outline:"none",borderRadius:"100%",background:"#6195ee",width:"88rpx",lineHeight:"88rpx",fontSize:"28rpx",position:"fixed",height:"88rpx",zIndex:"11111"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.onAddTap()}}},[e._v("新增")]):e._e(),!e.userid&&e.isAuthFront("shuji","新增")?i("v-uni-button",{staticClass:"add-btn",style:{border:"2rpx solid #fff",cursor:"pointer",boxShadow:"0 4rpx 8rpx rgba(0,0,0,.3)",color:"#fff",textAlign:"center",bottom:"160rpx",right:"128rpx",outline:"none",borderRadius:"100%",background:"#6195ee",width:"88rpx",lineHeight:"88rpx",fontSize:"28rpx",position:"fixed",height:"88rpx",zIndex:"11111"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.onAddTap()}}},[e._v("新增")]):e._e()],1)],1)},s=[];i.d(t,"b",(function(){return r})),i.d(t,"c",(function(){return s})),i.d(t,"a",(function(){return n}))},"9a64":function(e,t,i){"use strict";var n=i("4ea4");Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0,i("c5f6"),i("55dd"),i("96cf");var r=n(i("3b8d")),s={data:function(){return{btnColor:["#409eff","#67c23a","#909399","#e6a23c","#f56c6c","#356c6c","#351c6c","#f093a9","#a7c23a","#104eff","#10441f","#a21233","#503319"],queryList:[{queryName:"书籍编号"},{queryName:"书籍名称"}],queryIndex:0,list:[],lists:[],userid:"",mescroll:null,downOption:{auto:!1},upOption:{noMoreSize:5,textNoMore:"~ 没有更多了 ~"},hasNext:!0,searchForm:{},categoryList:[],categoryName:"全部",CustomBar:"0"}},computed:{baseUrl:function(){return this.$base.url}},onShow:function(){var e=(0,r.default)(regeneratorRuntime.mark((function e(){var t;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(1==uni.getStorageSync("useridTag")?(this.userid=uni.getStorageSync("useridTag"),uni.removeStorageSync("useridTag")):this.userid="",this.btnColor=this.btnColor.sort((function(){return.5-Math.random()})),t={},!this.userid){e.next=9;break}return e.next=6,this.$api.page("shujifenlei",{page:1,limit:100});case 6:t=e.sent,e.next=12;break;case 9:return e.next=11,this.$api.list("shujifenlei",{page:1,limit:100});case 11:t=e.sent;case 12:t.data.list.splice(0,0,{id:0,shujileixing:"全部"}),this.categoryList=t.data.list,this.hasNext=!0,this.mescroll&&this.mescroll.resetUpScroll();case 16:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}(),onLoad:function(e){1==uni.getStorageSync("useridTag")?(this.userid=uni.getStorageSync("useridTag"),uni.removeStorageSync("useridTag")):this.userid="",this.hasNext=!0,this.mescroll&&this.mescroll.resetUpScroll()},methods:{priceChange:function(e){return Number(e).toFixed(2)},preHttp:function(e){return e&&"http"==e.substr(0,4)},queryChange:function(e){this.queryIndex=e.detail.value,this.searchForm.shujibianhao="",this.searchForm.shujimingcheng=""},categoryClick:function(e){this.categoryName=e,this.mescroll.resetUpScroll()},mescrollInit:function(e){this.mescroll=e},downCallback:function(e){this.hasNext=!0,e.resetUpScroll()},upCallback:function(){var e=(0,r.default)(regeneratorRuntime.mark((function e(t){var i,n,r,s,a;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(i={page:t.num,limit:t.size},i["sort"]="id",i["order"]="desc",i["sort"]="id",i["order"]="desc",i["sort"]="id",i["order"]="desc",i["sort"]="id",i["order"]="desc",i["sort"]="id",i["order"]="desc",i["sort"]="id",i["order"]="desc",i["sort"]="id",i["order"]="desc",i["sort"]="id",i["order"]="desc",i["sort"]="id",i["order"]="desc",i["sort"]="id",i["order"]="desc",i["sort"]="id",i["order"]="desc","全部"!=this.categoryName&&(i.shujileixing="%"+this.categoryName+"%"),this.searchForm.shujibianhao&&(i["shujibianhao"]="%"+this.searchForm.shujibianhao+"%"),this.searchForm.shujimingcheng&&(i["shujimingcheng"]="%"+this.searchForm.shujimingcheng+"%"),n={},!this.userid){e.next=33;break}return e.next=30,this.$api.page("shuji",i);case 30:n=e.sent,e.next=36;break;case 33:return e.next=35,this.$api.list("shuji",i);case 35:n=e.sent;case 36:for(1==t.num&&(this.list=[]),this.list=this.list.concat(n.data.list),r=Math.ceil(this.list.length/6),s=[],a=0;a<r;a++)s[a]=this.list.slice(6*a,6*(a+1));this.lists=s,0==n.data.list.length&&(this.hasNext=!1),t.endSuccess(t.size,this.hasNext);case 44:case"end":return e.stop()}}),e,this)})));function t(t){return e.apply(this,arguments)}return t}(),onDetailTap:function(e){uni.setStorageSync("useridTag",this.userid),this.$utils.jump("./detail?id=".concat(e.id,"&userid=")+this.userid)},onUpdateTap:function(e){uni.setStorageSync("useridTag",this.userid),this.$utils.jump("./add-or-update?id=".concat(e))},onAddTap:function(){uni.setStorageSync("useridTag",this.userid),this.$utils.jump("./add-or-update")},onDeleteTap:function(e){var t=this;uni.showModal({title:"提示",content:"是否确认删除",success:function(){var i=(0,r.default)(regeneratorRuntime.mark((function i(n){return regeneratorRuntime.wrap((function(i){while(1)switch(i.prev=i.next){case 0:if(!n.confirm){i.next=5;break}return i.next=3,t.$api.del("shuji",JSON.stringify([e]));case 3:t.hasNext=!0,t.mescroll.resetUpScroll();case 5:case"end":return i.stop()}}),i)})));function n(e){return i.apply(this,arguments)}return n}()})},search:function(){var e=(0,r.default)(regeneratorRuntime.mark((function e(){var t,i,n,r,s;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(this.mescroll.num=1,t={page:this.mescroll.num,limit:this.mescroll.size},t["sort"]="id",t["order"]="desc",t["sort"]="id",t["order"]="desc",t["sort"]="id",t["order"]="desc",t["sort"]="id",t["order"]="desc",t["sort"]="id",t["order"]="desc",t["sort"]="id",t["order"]="desc",t["sort"]="id",t["order"]="desc",t["sort"]="id",t["order"]="desc",t["sort"]="id",t["order"]="desc",t["sort"]="id",t["order"]="desc",t["sort"]="id",t["order"]="desc",this.searchForm.shujibianhao&&(t["shujibianhao"]="%"+this.searchForm.shujibianhao+"%"),this.searchForm.shujimingcheng&&(t["shujimingcheng"]="%"+this.searchForm.shujimingcheng+"%"),i={},!this.userid){e.next=33;break}return e.next=30,this.$api.page("shuji",t);case 30:i=e.sent,e.next=36;break;case 33:return e.next=35,this.$api.list("shuji",t);case 35:i=e.sent;case 36:for(1==this.mescroll.num&&(this.list=[]),this.list=this.list.concat(i.data.list),n=Math.ceil(this.list.length/6),r=[],s=0;s<n;s++)r[s]=this.list.slice(6*s,6*(s+1));this.lists=r,0==i.data.list.length&&(this.hasNext=!1),this.mescroll.endSuccess(this.mescroll.size,this.hasNext);case 44:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}()}};t.default=s},"9bef":function(e,t,i){"use strict";i.r(t);var n=i("9a64"),r=i.n(n);for(var s in n)"default"!==s&&function(e){i.d(t,e,(function(){return n[e]}))}(s);t["default"]=r.a},c743:function(e,t,i){"use strict";i.r(t);var n=i("923f"),r=i("9bef");for(var s in r)"default"!==s&&function(e){i.d(t,e,(function(){return r[e]}))}(s);i("db87");var a,o=i("f0c5"),c=Object(o["a"])(r["default"],n["b"],n["c"],!1,null,"7a54a620",null,!1,n["a"],a);t["default"]=c.exports},db87:function(e,t,i){"use strict";var n=i("fd43"),r=i.n(n);r.a},fd43:function(e,t,i){var n=i("1055");"string"===typeof n&&(n=[[e.i,n,""]]),n.locals&&(e.exports=n.locals);var r=i("4f06").default;r("70b54248",n,!0,{sourceMap:!1,shadowMode:!1})}}]);