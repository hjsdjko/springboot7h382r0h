(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-chaptershuji-add-or-update"],{"2f4b":function(e,t,r){"use strict";var i=r("4ea4");Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0,r("a481"),r("c5f6"),r("f559"),r("ac6a"),r("28a5"),r("96cf");var n=i(r("3b8d")),a=i(r("e2b1")),o=i(r("064f")),s=i(r("bd56")),u={data:function(){return{cross:"",ruleForm:{refid:"",chapternum:"",chaptertitle:"",content:"",vipread:""},vipreadOptions:[],vipreadIndex:0,user:{},ro:{refid:!1,chapternum:!1,chaptertitle:!1,content:!1,vipread:!1}}},components:{wPicker:a.default,xiaEditor:o.default,multipleSelect:s.default},computed:{baseUrl:function(){return this.$base.url}},onLoad:function(){var e=(0,n.default)(regeneratorRuntime.mark((function e(t){var r,i,n,a;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return r=uni.getStorageSync("nowTable"),e.next=3,this.$api.session(r);case 3:if(i=e.sent,this.user=i.data,this.vipreadOptions="是,否".split(","),this.ruleForm.userid=uni.getStorageSync("userid"),t.refid&&(this.ruleForm.refid=t.refid,this.ruleForm.nickname=uni.getStorageSync("nickname")),!t.id){e.next=14;break}return this.ruleForm.id=t.id,e.next=12,this.$api.info("chaptershuji",this.ruleForm.id);case 12:i=e.sent,this.ruleForm=i.data;case 14:if(this.cross=t.cross,!t.cross){e.next=42;break}n=uni.getStorageSync("crossObj"),e.t0=regeneratorRuntime.keys(n);case 18:if((e.t1=e.t0()).done){e.next=42;break}if(a=e.t1.value,"refid"!=a){e.next=24;break}return this.ruleForm.refid=n[a],this.ro.refid=!0,e.abrupt("continue",18);case 24:if("chapternum"!=a){e.next=28;break}return this.ruleForm.chapternum=n[a],this.ro.chapternum=!0,e.abrupt("continue",18);case 28:if("chaptertitle"!=a){e.next=32;break}return this.ruleForm.chaptertitle=n[a],this.ro.chaptertitle=!0,e.abrupt("continue",18);case 32:if("content"!=a){e.next=36;break}return this.ruleForm.content=n[a],this.ro.content=!0,e.abrupt("continue",18);case 36:if("vipread"!=a){e.next=40;break}return this.ruleForm.vipread=n[a],this.ro.vipread=!0,e.abrupt("continue",18);case 40:e.next=18;break;case 42:this.styleChange(),this.$forceUpdate();case 44:case"end":return e.stop()}}),e,this)})));function t(t){return e.apply(this,arguments)}return t}(),methods:{contentChange:function(e){this.ruleForm.content=e},styleChange:function(){this.$nextTick((function(){}))},vipreadChange:function(e){this.vipreadIndex=e.target.value,this.ruleForm.vipread=this.vipreadOptions[this.vipreadIndex]},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=(0,n.default)(regeneratorRuntime.mark((function e(){var t,r,i,n,a,o,s,u,d,c;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(this.ruleForm.refid){e.next=3;break}return this.$utils.msg("关联表id不能为空"),e.abrupt("return");case 3:if(this.ruleForm.chapternum){e.next=6;break}return this.$utils.msg("章节数不能为空"),e.abrupt("return");case 6:if(!this.ruleForm.chapternum||this.$validate.isIntNumer(this.ruleForm.chapternum)){e.next=9;break}return this.$utils.msg("章节数应输入整数"),e.abrupt("return");case 9:if(this.ruleForm.chaptertitle){e.next=12;break}return this.$utils.msg("章节标题不能为空"),e.abrupt("return");case 12:if(this.ruleForm.content){e.next=15;break}return this.$utils.msg("章节内容不能为空"),e.abrupt("return");case 15:if(!this.cross){e.next=32;break}if(uni.setStorageSync("crossCleanType",!0),a=uni.getStorageSync("statusColumnName"),o=uni.getStorageSync("statusColumnValue"),""==a){e.next=32;break}if(t||(t=uni.getStorageSync("crossObj")),a.startsWith("[")){e.next=28;break}for(s in t)s==a&&(t[s]=o);return u=uni.getStorageSync("crossTable"),e.next=26,this.$api.update("".concat(u),t);case 26:e.next=32;break;case 28:r=Number(uni.getStorageSync("userid")),i=t["id"],n=uni.getStorageSync("statusColumnName"),n=n.replace(/\[/,"").replace(/\]/,"");case 32:if(!i||!r){e.next=55;break}return this.ruleForm.crossuserid=r,this.ruleForm.crossrefid=i,d={page:1,limit:10,crossuserid:r,crossrefid:i},e.next=38,this.$api.list("chaptershuji",d);case 38:if(c=e.sent,!(c.data.total>=n)){e.next=45;break}return this.$utils.msg(uni.getStorageSync("tips")),uni.removeStorageSync("crossCleanType"),e.abrupt("return",!1);case 45:if(!this.ruleForm.id){e.next=50;break}return e.next=48,this.$api.update("chaptershuji",this.ruleForm);case 48:e.next=52;break;case 50:return e.next=52,this.$api.add("chaptershuji",this.ruleForm);case 52:this.$utils.msgBack("提交成功");case 53:e.next=63;break;case 55:if(!this.ruleForm.id){e.next=60;break}return e.next=58,this.$api.update("chaptershuji",this.ruleForm);case 58:e.next=62;break;case 60:return e.next=62,this.$api.add("chaptershuji",this.ruleForm);case 62:this.$utils.msgBack("提交成功");case 63:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}(),optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var t=new Date,r=t.getFullYear(),i=t.getMonth()+1,n=t.getDate();return"start"===e?r-=60:"end"===e&&(r+=2),i=i>9?i:"0"+i,n=n>9?n:"0"+n,"".concat(r,"-").concat(i,"-").concat(n)},toggleTab:function(e){this.$refs[e].show()}}};t.default=u},"44fd":function(e,t,r){"use strict";var i=r("b3d1"),n=r.n(i);n.a},5536:function(e,t,r){"use strict";r.r(t);var i=r("2f4b"),n=r.n(i);for(var a in i)"default"!==a&&function(e){r.d(t,e,(function(){return i[e]}))}(a);t["default"]=n.a},"81e3":function(e,t,r){"use strict";r.r(t);var i=r("9393"),n=r("5536");for(var a in n)"default"!==a&&function(e){r.d(t,e,(function(){return n[e]}))}(a);r("44fd");var o,s=r("f0c5"),u=Object(s["a"])(n["default"],i["b"],i["c"],!1,null,"690b6266",null,!1,i["a"],o);t["default"]=u.exports},9393:function(e,t,r){"use strict";var i={"xia-editor":r("064f").default},n=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("v-uni-view",{staticClass:"content"},[r("v-uni-view",{style:{minHeight:"100vh",width:"100%",padding:"0 0 240rpx",position:"relative",background:"url() fixed,#fff",height:"auto"}},[r("v-uni-form",{staticClass:"app-update-pv",style:{width:"100%",padding:"60rpx 40rpx",background:"none",display:"block",height:"auto"}},[r("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"inset 0px 0px 0px 0px #f9edd9",margin:"0 0 20rpx 0",borderColor:"#e9be70",alignItems:"baseline",display:"flex",minHeight:"120rpx",borderRadius:"0",borderWidth:"0px 0px 0px",background:"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"auto",padding:"0 20rpx 0 40rpx",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[e._v("章节数")]),r("v-uni-input",{style:{border:"0",padding:"0px 24rpx",margin:"0px",color:"#666",borderRadius:"8rpx",flex:"1",background:"rgba(255, 255, 255, 0)",fontSize:"28rpx",height:"80rpx"},attrs:{disabled:e.ro.chapternum,placeholder:"章节数"},model:{value:e.ruleForm.chapternum,callback:function(t){e.$set(e.ruleForm,"chapternum",t)},expression:"ruleForm.chapternum"}})],1),r("v-uni-view",{style:{padding:"12rpx 0",boxShadow:"inset 0px 0px 0px 0px #f9edd9",margin:"0 0 20rpx 0",borderColor:"#e9be70",alignItems:"baseline",display:"flex",minHeight:"120rpx",borderRadius:"0",borderWidth:"0px 0px 0px",background:"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"auto",padding:"0 20rpx 0 40rpx",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[e._v("章节标题")]),r("v-uni-input",{style:{border:"0",padding:"0px 24rpx",margin:"0px",color:"#666",borderRadius:"8rpx",flex:"1",background:"rgba(255, 255, 255, 0)",fontSize:"28rpx",height:"80rpx"},attrs:{disabled:e.ro.chaptertitle,placeholder:"章节标题"},model:{value:e.ruleForm.chaptertitle,callback:function(t){e.$set(e.ruleForm,"chaptertitle",t)},expression:"ruleForm.chaptertitle"}})],1),r("v-uni-view",{staticClass:" select",style:{padding:"12rpx 0",boxShadow:"inset 0px 0px 0px 0px #f9edd9",margin:"0 0 20rpx 0",borderColor:"#e9be70",alignItems:"baseline",display:"flex",minHeight:"120rpx",borderRadius:"0",borderWidth:"0px 0px 0px",background:"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"auto",padding:"0 20rpx 0 40rpx",lineHeight:"80rpx",fontSize:"28rpx",color:"#333",textAlign:"right"}},[e._v("会员阅读")]),r("v-uni-picker",{style:{width:"100%",flex:"1",height:"auto"},attrs:{value:e.vipreadIndex,range:e.vipreadOptions},on:{change:function(t){arguments[0]=t=e.$handleEvent(t),e.vipreadChange.apply(void 0,arguments)}}},[r("v-uni-view",{staticClass:"uni-input",style:{width:"100%",lineHeight:"80rpx",fontSize:"28rpx",color:"#666"}},[e._v(e._s(e.ruleForm.vipread?e.ruleForm.vipread:"请选择会员阅读"))])],1)],1),r("v-uni-view",{style:{padding:"12rpx 0",margin:"0 0 24rpx 0",borderColor:"#ccc",borderWidth:"0 0 0px 0",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"100%",padding:"0 40rpx",lineHeight:"80rpx",fontSize:"28rpx",color:"#111",fontWeight:"500"}},[e._v("章节内容")]),r("xia-editor",{ref:"editor",style:{minHeight:"300rpx",padding:"24rpx 40rpx",boxShadow:"inset 0px 0px 0px 0px #f9edd9",borderColor:"#e9be70",borderRadius:"0",background:"url(http://codegen.caihongy.cn/20221221/c8ff0c9649f9472e926677fcfdbbdd44.png) repeat-x left bottom,#d7eff8",borderWidth:"0px 0px 0px",width:"100%",borderStyle:"solid",height:"auto"},attrs:{placeholder:"章节内容"},on:{editorChange:function(t){arguments[0]=t=e.$handleEvent(t),e.contentChange.apply(void 0,arguments)}},model:{value:e.ruleForm.content,callback:function(t){e.$set(e.ruleForm,"content",t)},expression:"ruleForm.content"}})],1),r("v-uni-view",{staticClass:"btn",style:{width:"100%",margin:"40rpx 0 0 0",justifyContent:"center",display:"flex",height:"auto"}},[r("v-uni-button",{staticClass:"bg-red",style:{padding:"0 40rpx",boxShadow:"2rpx 4rpx 8rpx #ccc",margin:"0 40rpx 0 0",borderColor:"#ef6d0d",color:"#333",display:"inline",minWidth:"200rpx",borderRadius:"40rpx",background:"linear-gradient(180deg, rgba(253,246,139,1) 0%, rgba(254,233,97,1) 84%, rgba(255,220,52,1) 100%),#ffdc34",borderWidth:"0 0 8rpx",width:"auto",lineHeight:"72rpx",fontSize:"28rpx",borderStyle:"solid",height:"80rpx"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.onSubmitTap.apply(void 0,arguments)}}},[e._v("提交")])],1)],1)],1)],1)},a=[];r.d(t,"b",(function(){return n})),r.d(t,"c",(function(){return a})),r.d(t,"a",(function(){return i}))},b3d1:function(e,t,r){var i=r("d8f5");"string"===typeof i&&(i=[[e.i,i,""]]),i.locals&&(e.exports=i.locals);var n=r("4f06").default;n("581eb43a",i,!0,{sourceMap:!1,shadowMode:!1})},d8f5:function(e,t,r){var i=r("24fb");t=i(!1),t.push([e.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-690b6266]{min-height:calc(100vh - 44px);box-sizing:border-box}',""]),e.exports=t}}]);