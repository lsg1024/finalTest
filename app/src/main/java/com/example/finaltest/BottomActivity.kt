package com.example.finaltest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import net.daum.mf.map.api.MapView
import android.view.ViewGroup


class BottomActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom)

//        if (checkLocationService()) {
//            permissionCheck()
//        } else {
//            Toast.makeText(this, "GPS를 켜주세요", Toast.LENGTH_SHORT).show()
//        }


        var mapView = net.daum.android.map.MapView(this)
        var mapViewContainer = findViewById(R.id.clKakaoMapView) as? ViewGroup

        mapViewContainer?.addView(mapView)

    }

//    private fun permissionCheck() {
//        val preference = getPreferences(MODE_PRIVATE)
//        val isFirstCheck = preference.getBoolean("isFirstPermissionCheck", true)
//        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
//            // 권한이 없는 상태
//            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
//                    Manifest.permission.ACCESS_FINE_LOCATION)) {
//                // 권한 거절
//                val builder = AlertDialog.Builder(this)
//                builder.setMessage("현재 위치를 확인하시려면 위치 권한을 허용해주세요.")
//                builder.setPositiveButton("확인") { dialog, which ->
//                    ActivityCompat.requestPermissions(this,
//                        arrayOf(Manifest.permission.ACCESS_FINE_LOCATION), ACCESS_FINE_LOCATION)
//                }
//                builder.setNegativeButton("취소") { dialog, which ->
//
//                }
//                builder.show()
//            } else {
//                if (isFirstCheck) {
//                    // 최초 권한 요청
//                    preference.edit().putBoolean("isFirstPermissionCheck", false).apply()
//                    ActivityCompat.requestPermissions(this,
//                        arrayOf(Manifest.permission.ACCESS_FINE_LOCATION), ACCESS_FINE_LOCATION)
//                } else {
//                    val builder = AlertDialog.Builder(this)
//                    builder.setMessage("현재 위치를 확인하시려면 설정에서 위치 권한을 허용해주세요.")
//                    builder.setPositiveButton("설정으로 이동") { dialog, which ->
//                        val intent = Intent(BassBoost.Settings.ACTION_APPLICATION_DETAILS_SETTINGS, Uri.parse("package:$packageName"))
//                        startActivity(intent)
//                    }
//                    builder.setNegativeButton("취소") { dialog, which ->
//
//                    }
//                    builder.show()
//                }
//            }
//        } else {
//
//        }
//
//    }
//
//    // 권한 요청
//    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
//        if (requestCode == ACCESS_FINE_LOCATION) {
//            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                Toast.makeText(this, "위치 권한이 승인되었습니다", Toast.LENGTH_SHORT).show()
//
//            } else {
//                Toast.makeText(this, "위치 권한이 거절되었습니다", Toast.LENGTH_SHORT).show()
//
//            }
//        }
//    }
//
//    // GPS가 켜져있는지 확인
//    private fun checkLocationService(): Boolean {
//        val locationManager = getSystemService(Context.LOCATION_SERVICE) as LocationManager
//        return locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)
//    }

}