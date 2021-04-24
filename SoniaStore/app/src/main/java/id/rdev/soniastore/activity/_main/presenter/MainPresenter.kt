package id.rdev.soniastore.activity._main.presenter

import id.rdev.soniastore.activity.penjualan.data.ResultKeranjang
import id.rdev.soniastore.model.KeranjangStatus
import id.rdev.soniastore.network.NetworkConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
//lilissonia18090051
class MainPresenter(val mainView: MainView) {
    fun getReportLastDay(id_user: Int?) {
        NetworkConfig.service()
            .getReportLastDay(id_user, KeranjangStatus.TERJUAL.status)
            .enqueue(object: Callback<ResultKeranjang>{
                override fun onFailure(call: Call<ResultKeranjang>, t: Throwable) {
                    mainView.onFailedReport(t.localizedMessage)
                }

                override fun onResponse(
                    call: Call<ResultKeranjang>,
                    response: Response<ResultKeranjang>
                ) {
                    val body = response.body()
                    if (body?.status == 200) {
                        mainView.onSuccessReportLastDay(body?.keranjang)
                    } else {
                        mainView.onFailedReport(body?.message)
                    }
                }

            })
    }
    fun getReportNowDay(id_user: Int?) {
        NetworkConfig.service()
            .getReportNowDay(id_user, KeranjangStatus.TERJUAL.status)
            .enqueue(object: Callback<ResultKeranjang>{
                override fun onFailure(call: Call<ResultKeranjang>, t: Throwable) {
                    mainView.onFailedReport(t.localizedMessage)
                }

                override fun onResponse(
                    call: Call<ResultKeranjang>,
                    response: Response<ResultKeranjang>
                ) {
                    val body = response.body()
                    if (body?.status == 200) {
                        mainView.onSuccessReportNowDay(body?.keranjang)
                    } else {
                        mainView.onFailedReport(body?.message)
                    }
                }

            })
    }


    fun getReportLastWeek(id_user: Int?) {
        NetworkConfig.service()
            .getReportLastWeek(id_user, KeranjangStatus.TERJUAL.status)
            .enqueue(object: Callback<ResultKeranjang>{
                override fun onFailure(call: Call<ResultKeranjang>, t: Throwable) {
                    mainView.onFailedReport(t.localizedMessage)
                }

                override fun onResponse(
                    call: Call<ResultKeranjang>,
                    response: Response<ResultKeranjang>
                ) {
                    val body = response.body()
                    if (body?.status == 200) {
                        mainView.onSuccessReportLastWeek(body?.keranjang)
                    } else {
                        mainView.onFailedReport(body?.message)
                    }
                }

            })
    }
    fun getReportNowWeek(id_user: Int?) {
        NetworkConfig.service()
            .getReportNowWeek(id_user, KeranjangStatus.TERJUAL.status)
            .enqueue(object: Callback<ResultKeranjang>{
                override fun onFailure(call: Call<ResultKeranjang>, t: Throwable) {
                    mainView.onFailedReport(t.localizedMessage)
                }

                override fun onResponse(
                    call: Call<ResultKeranjang>,
                    response: Response<ResultKeranjang>
                ) {
                    val body = response.body()
                    if (body?.status == 200) {
                        mainView.onSuccessReportNowWeek(body?.keranjang)
                    } else {
                        mainView.onFailedReport(body?.message)
                    }
                }

            })
    }

    fun getReportLastMonth(id_user: Int?) {
        NetworkConfig.service()
            .getReportLastMonth(id_user, KeranjangStatus.TERJUAL.status)
            .enqueue(object: Callback<ResultKeranjang>{
                override fun onFailure(call: Call<ResultKeranjang>, t: Throwable) {
                    mainView.onFailedReport(t.localizedMessage)
                }

                override fun onResponse(
                    call: Call<ResultKeranjang>,
                    response: Response<ResultKeranjang>
                ) {
                    val body = response.body()
                    if (body?.status == 200) {
                        mainView.onSuccessReportLastMonth(body.keranjang)
                    } else {
                        mainView.onFailedReport(body?.message)
                    }
                }
            })
    }
    fun getReportNowMonth(id_user: Int?) {
        NetworkConfig.service()
            .getReportNowMonth(id_user, KeranjangStatus.TERJUAL.status)
            .enqueue(object: Callback<ResultKeranjang>{
                override fun onFailure(call: Call<ResultKeranjang>, t: Throwable) {
                    mainView.onFailedReport(t.localizedMessage)
                }

                override fun onResponse(
                    call: Call<ResultKeranjang>,
                    response: Response<ResultKeranjang>
                ) {
                    val body = response.body()
                    if (body?.status == 200) {
                        mainView.onSuccessReportNowMonth(body.keranjang)
                    } else {
                        mainView.onFailedReport(body?.message)
                    }
                }
            })
    }
}