package com.lb.extend.service

import com.lb.extend.command.LonbonEvent
import com.zclever.ipc.annotation.BindImpl

import com.zclever.ipc.core.Result

/**
 * 提供系统设置相关的服务
 */
//@BindImpl("com.lonbon.lonbon_app.xxx"),这里要使用BindImpl注解
@BindImpl("com.lonbon.lonbonprovider.manager.EventProviderManager")
interface SystemSetService {

    /**
     * 监听各种按钮事件
     */
    fun setEventCallBack(callBack :Result<LonbonEvent>)

    /**
     * 门灯控制
     * @color color 参数：
     * 1 红闪，2 红亮，3 蓝闪，4 蓝亮，5 绿闪，6 绿亮，7 青闪，8 青亮，9 红蓝闪
     * 10 红绿闪，11 蓝绿闪，12 紫闪，13 紫亮，14 黄闪，15 黄亮，16 白亮，17 白闪，18 黑亮，19 黑闪
     * @param bOn 开关：
     *  true为开，false为关
     *
     *  门灯对应的颜色必须一开一关。
     *  如果打开了1 在打开了3 就会是3现象。关闭3 就会是1现象。在关闭1 门灯才会熄灭
     */
    fun extDoorLampCtrl(color: Int, bOn: Boolean)

    /**
     * NFC刷卡器开关
     * @param bOn 开关：true 为打开， false为关闭
     */
    fun nfcControl(bOn:Boolean)

    /**
     * 开关屏
     * @param open 开关：true 为开屏， false为关屏
     */
    fun panelPowerControl(open:Boolean)

}
