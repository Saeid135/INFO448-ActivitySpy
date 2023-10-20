package edu.uw.ischool.saeid135.activityspy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import edu.uw.ischool.saeid135.activityspy.ui.theme.ActivitySpyTheme
import android.util.Log;


class MainActivity : ComponentActivity() {
    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ActivitySpyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("UW")
                }
            }
        }
        Log.i(TAG, "on{onCreate} event fired");
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "on{onStart} event fired");

    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "on{onResume} event fired");
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "on{onPause} event fired");
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "on{onStop} event fired");
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "on{onDestroy} event fired");
        Log.e(TAG, "We're going down, Captain!");
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "on{Restart} event fired");
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Greetings $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ActivitySpyTheme {
        Greeting("UW")
    }
}