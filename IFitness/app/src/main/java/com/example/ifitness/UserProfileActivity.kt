package com.example.ifitness



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.Observer
import com.example.ifitness.viewmodel.UserViewModel
import com.google.android.material.textfield.TextInputEditText

class UserProfileActivity : AppCompatActivity() {

    lateinit var toolbar: Toolbar
    lateinit var txtTitle: TextView
    lateinit var edtName: TextInputEditText
    lateinit var edtSurname: TextInputEditText
    lateinit var edtEmail: TextInputEditText
    lateinit var edtDateOfBirth: TextInputEditText
    lateinit var spnGender: Spinner
    lateinit var btnProfileUpdate: Button

    private val userViewModel by viewModels<UserViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)
        setToolBar()
        setComponents()
        loadUserLogged();
    }


    private fun loadUserLogged() {
        userViewModel.isLogged().observe(this, Observer {
            if (it != null) {
                edtName.setText(it.name)
                edtSurname.setText(it.surname)
                edtEmail.setText(it.email)
                if(it.dateOfBirth != null){
                    edtDateOfBirth.setText(it.dateOfBirth.toString())
                }else{
                    edtDateOfBirth.setText("")
                }
                resources.getStringArray(R.array.gender).asList().indexOf(it.gender?.value).let {
                    spnGender.setSelection(it)
                }
            } else {
                startActivity(Intent(this, LoginActivity::class.java))
                finish()
            }
        })
    }

    private fun setComponents() {
        edtName = findViewById(R.id.txt_edt_name);
        edtSurname = findViewById(R.id.txt_edt_surname);
        edtEmail = findViewById(R.id.txt_edt_email);
        edtDateOfBirth = findViewById(R.id.txt_edt_date_of_birth);
        spnGender = findViewById(R.id.spn_gender);
    }

    private fun setToolBar() {
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        txtTitle = findViewById(R.id.toolbar_title)
        txtTitle.text = getString(R.string.user_profile)
    }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}