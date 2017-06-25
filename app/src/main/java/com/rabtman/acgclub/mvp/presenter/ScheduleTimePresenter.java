/*
package com.rabtman.acgclub.mvp.presenter;

import android.util.SparseIntArray;
import com.rabtman.acgclub.base.constant.SystemConstant;
import com.rabtman.acgclub.mvp.contract.ScheduleMainContract;
import com.rabtman.acgclub.mvp.model.entity.ScheduleTimeItem;
import com.rabtman.acgclub.mvp.model.jsoup.DilidiliInfo;
import com.rabtman.acgclub.mvp.model.jsoup.ScheduleWeek;
import com.rabtman.acgclub.mvp.model.jsoup.ScheduleWeek.ScheduleItem;
import com.rabtman.common.base.CommonSubscriber;
import com.rabtman.common.base.mvp.BasePresenter;
import com.rabtman.common.di.scope.ActivityScope;
import com.rabtman.common.utils.LogUtil;
import com.rabtman.common.utils.RxUtil;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

*/
/**
 * @author Rabtman
 *//*


@ActivityScope
public class ScheduleTimePresenter extends
    BasePresenter<ScheduleMainContract.Model, ScheduleMainContract.View> {

  private SparseIntArray headerArray = new SparseIntArray();

  @Inject
  public ScheduleTimePresenter(ScheduleMainContract.Model model,
      ScheduleMainContract.View rootView) {
    super(model, rootView);
  }

  public int getHeaderPositionByIndex(int index) {
    return headerArray.get(index);
  }

  public void getDilidiliInfo() {
    addSubscribe(
        mModel.getDilidiliInfo()
            .map(new Function<DilidiliInfo, List<ScheduleTimeItem>>() {
              @Override
              public List<ScheduleTimeItem> apply(@NonNull DilidiliInfo dilidiliInfo)
                  throws Exception {
                //将数据源转化为列表展示的格式
                List<ScheduleTimeItem> scheduleTimeItems = new ArrayList<>();
                int headerPos = 0;
                for (int i = 0; i < dilidiliInfo.getScheduleWeek().size(); i++) {
                  ScheduleWeek schduleWeek = dilidiliInfo.getScheduleWeek().get(i);
                  scheduleTimeItems
                      .add(new ScheduleTimeItem(true, SystemConstant.SCHEDULE_WEEK_TITLE[i], i));
                  headerArray.put(i, headerPos);
                  headerPos++;
                  for (ScheduleItem scheduleItem : schduleWeek.getScheduleItems()) {
                    scheduleTimeItems.add(new ScheduleTimeItem(scheduleItem));
                    headerPos++;
                  }
                }
                return scheduleTimeItems;
              }
            })
            .compose(RxUtil.<List<ScheduleTimeItem>>rxSchedulerHelper())
            .subscribeWith(new CommonSubscriber<List<ScheduleTimeItem>>(mView) {
              @Override
              protected void onStart() {
                super.onStart();
                mView.showLoading();
              }

              @Override
              public void onComplete() {
                mView.hideLoading();
              }

              @Override
              public void onNext(List<ScheduleTimeItem> acgScheduleInfo) {
                LogUtil.d("getAcgSchedule");
              }
            })
    );
  }

}
*/
