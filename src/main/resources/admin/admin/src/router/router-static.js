import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import yueduqiandao from '@/views/modules/yueduqiandao/list'
    import qiandaodaka from '@/views/modules/qiandaodaka/list'
    import huodongzuzhizhe from '@/views/modules/huodongzuzhizhe/list'
    import dushuhuihuodong from '@/views/modules/dushuhuihuodong/list'
    import storeup from '@/views/modules/storeup/list'
    import forum from '@/views/modules/forum/list'
    import huodongrizhi from '@/views/modules/huodongrizhi/list'
    import jiazhang from '@/views/modules/jiazhang/list'
    import huodongshenqing from '@/views/modules/huodongshenqing/list'
    import quxiaoshenqing from '@/views/modules/quxiaoshenqing/list'
    import shujifenlei from '@/views/modules/shujifenlei/list'
    import chat from '@/views/modules/chat/list'
    import chaptershuji from '@/views/modules/chaptershuji/list'
    import shuji from '@/views/modules/shuji/list'
    import discussdushuhuihuodong from '@/views/modules/discussdushuhuihuodong/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
export const routes = [{
    path: '/',
    name: '系统首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '系统首页',
      component: Home,
      meta: {icon:'', title:'center', affix: true}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/yueduqiandao',
        name: '阅读签到',
        component: yueduqiandao
      }
      ,{
	path: '/qiandaodaka',
        name: '签到打卡',
        component: qiandaodaka
      }
      ,{
	path: '/huodongzuzhizhe',
        name: '活动组织者',
        component: huodongzuzhizhe
      }
      ,{
	path: '/dushuhuihuodong',
        name: '读书会活动',
        component: dushuhuihuodong
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/forum',
        name: '会员交流',
        component: forum
      }
      ,{
	path: '/huodongrizhi',
        name: '活动日志',
        component: huodongrizhi
      }
      ,{
	path: '/jiazhang',
        name: '家长',
        component: jiazhang
      }
      ,{
	path: '/huodongshenqing',
        name: '活动申请',
        component: huodongshenqing
      }
      ,{
	path: '/quxiaoshenqing',
        name: '取消申请',
        component: quxiaoshenqing
      }
      ,{
	path: '/shujifenlei',
        name: '书籍分类',
        component: shujifenlei
      }
      ,{
	path: '/chat',
        name: '在线客服',
        component: chat
      }
      ,{
	path: '/chaptershuji',
        name: '书籍章节',
        component: chaptershuji
      }
      ,{
	path: '/shuji',
        name: '书籍',
        component: shuji
      }
      ,{
	path: '/discussdushuhuihuodong',
        name: '读书会活动评论',
        component: discussdushuhuihuodong
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
