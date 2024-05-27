import {createRouter, createWebHistory} from 'vue-router';

const router = createRouter({

    history: createWebHistory(),
    routes: [
        {
            path: '/',
            component: () => import('../views/Login/Login.vue')
        },
        {
            path: '/find/id',
            component: () => import('../views/Login/FindId.vue')
        },
        {
            path: '/find/pwd',
            component: () => import('../views/Login/FindPwd.vue')
        },
        {
            path: '/find/id/result',
            component: () => import('../views/Login/FindIdResult.vue')
        },
        {
            path: '/find/pwd/:email/result',
            component: () => import('../views/Login/FindPwdResult.vue')
        },
        {
            path: '/department',
            component: () => import('@/components/Department/Department.vue')
        },        
        {
            path: '/addteamreview',
            component: () => import('@/components/TeamReview/AddTeamReview.vue')
        },
        // {
        //     path: '/team',
        //     component: () => import('@/components/Department/Team.vue')
        // },
        {
            path: '/performance-review-goal/add',
            component: () => import('../views/PerformanceReview/GoalAddView.vue')
        },
        {
            path: '/performance-review-goal',
            component: () => import('../views/PerformanceReview/GoalListView.vue')
        },
        {
            path: '/review-goal/detail/:id',
            component: () => import('../views/PerformanceReview/GoalDetailView.vue')
        },
        {
            path: '/ad-time',
            component: () => import('../views/AdTime/AdTimeListView.vue')
        },
        {
            path: '/ad-time/add',
            component: () => import('../views/AdTime/AdTimeAddView.vue')
        },
        {
            path: '/hr',
            component: () => import('../views/HumanResources/Main.vue')
        },
        {
            path: '/hr/profile/:employeeNumber',
            component: () => import('../views/HumanResources/Profile.vue')
        },
        {
            path: '/hr/modify/list',
            component: () => import('../views/HumanResources/ModifyMulti.vue')
        },
        {
            path: '/hr/modify/:employeeNumber',
            component: () => import('../views/HumanResources/Modify.vue')
        },
        {
            path: '/hr/add/list',
            component: () => import('../views/HumanResources/AddMulti.vue')
        },
        {
            path: '/hr/add',
            component: () => import('../views/HumanResources/Add.vue')
        },
        {
            path: '/bt',
            component: () => import('@/views/Approval/BTApprovalListView.vue')
        },
        {
            path: '/overtime',
            component: () => import('@/views/Approval/OApprovalListView.vue')
        },
        {
            path: '/vacation',
            component: () => import('@/views/Approval/VApprovalListView.vue')
        },
        {
            path: '/approval',
            component: () => import('@/views/Approval/AllApprovalListView.vue')
        },
        {
            path: '/approval-detail/:typeId/:approvalId',
            component: () => import('@/views/Approval/ApprovalDetailView.vue')
        },
        {
            path: '/vacation/policy',
            component:() => import('../views/VacationPolicyView.vue')
        },
        {
            path: '/vacation/policy/modify/:id',
            component:() => import('../views/VacationPolicyModifyView.vue')
        },
        {
            path: '/vacation/policy/regist',
            component:() => import('../views/VacationPolicyRegistView.vue')
        },
        {
            path: '/vacation/manage',
            component:() => import('../views/VacationManageMainView.vue')
        },
        {
            path: '/vacation/manage/regist',
            component:() => import('../views/VacationManageRegistView.vue')
        },
        {
            path: '/vacation/manage/modify/:id',
            component:() => import('../views/VacationManageDeleteView.vue')
        },
        {
            path: '/vacation/history',
            component:() => import('../views/VacationHistoryMainView.vue')
        },
        {
            path: '/vacation/info',
            component:() => import('../views/VacationInfoMainView.vue')
        },
        {
            path: '/bt/:employeeId',
            component: () => import('@/views/Approval/BTApprovalListView.vue')
        },
        {
            path: '/overtime/:employeeId',
            component: () => import('@/views/Approval/OApprovalListView.vue')
        },
        {
            path: '/vacation/:employeeId',
            component: () => import('@/views/Approval/VApprovalListView.vue')
        },
        {
            path: '/approval/:employeeId',
            component: () => import('@/views/Approval/AllApprovalListView.vue')
        },
        {
            path: '/approval/detail/:typeId/:approvalId',
            component: () => import('@/views/Approval/ApprovalDetailView.vue')
        },
        {
            path: '/required',
            component: () => import('@/views/Approval/RequiredApprovalListView.vue')
        },
        {
            path: '/regist/bt',
            component: () => import('@/views/Approval/RegistBTApprovalView.vue')
        },
        {
            path: '/regist/overtime',
            component: () => import('@/views/Approval/RegistOApprovalView.vue')
        },
        {
            path: '/regist/rw',
            component: () => import('@/views/Approval/RegistRWApprovalView.vue')
        },
        {
            path: '/regist/vacation',
            component: () => import('@/views/Approval/RegistVApprovalView.vue')
        }
    ]
})

export default router;