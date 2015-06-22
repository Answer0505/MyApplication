package com.example.s.traveldating;

import android.app.Activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.media.Image;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends Activity implements View.OnClickListener {
    private ProfileFragment profileFragment;
    private BrowseFragment browseFragment;
    private MessageFragment messageFragment;
    private SettingFragment settingFragment;


    private View profileLayout;
    private View browseLayout;
    private View messageLayout;
    private View settingLayout;

    private ImageView profileImage;
    private ImageView browseImage;
    private ImageView messageImage;
    private ImageView settingImage;

    private FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        fragmentManager = getFragmentManager();
        selectTableSelction(0);
    }

    private void initViews() {
        profileLayout = findViewById(R.id.profile_layout);
        browseLayout = findViewById(R.id.browse_layout);
        messageLayout = findViewById(R.id.message_layout);
        settingLayout = findViewById(R.id.setting_layout);

        profileImage = (ImageView) findViewById(R.id.profile_image);
        browseImage = (ImageView) findViewById(R.id.browse_image);
        messageImage = (ImageView) findViewById(R.id.message_image);
        settingImage = (ImageView) findViewById(R.id.setting_image);

        profileLayout.setOnClickListener(this);
        browseLayout.setOnClickListener(this);
        messageLayout.setOnClickListener(this);
        settingLayout.setOnClickListener(this);


    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.profile_layout:
                selectTableSelction(0);
                break;

            case R.id.browse_layout:
                selectTableSelction(1);
                break;

            case R.id.message_layout:
                selectTableSelction(2);

                break;
            case R.id.setting_layout:

                selectTableSelction(3);
                break;
            default:
                break;
        }

    }

    private void selectTableSelction(int index) {
        clearSelection();

        FragmentTransaction transaction = fragmentManager.beginTransaction();

        hideFragments(transaction);

        switch (index) {
            case 0:
                profileImage.setImageResource(R.drawable.manageprofile_select);

                if (profileFragment == null) {
                    profileFragment = new ProfileFragment();
                    transaction.add(R.id.content, profileFragment);
                } else {
                    transaction.show(profileFragment);
                }
                break;
            case 1:
                browseImage.setImageResource(R.drawable.browseimage_select);

                if (browseFragment == null) {
                    browseFragment = new BrowseFragment();
                    transaction.add(R.id.content, browseFragment);
                } else {
                    transaction.show(browseFragment);
                }
                break;
            case 2:
                messageImage.setImageResource(R.drawable.messageimage_select);

                if (messageFragment == null) {
                    messageFragment = new MessageFragment();
                    transaction.add(R.id.content, messageFragment);
                } else {
                    transaction.show(messageFragment);
                }
                break;

            case 3:
                settingImage.setImageResource(R.drawable.settingsimage_select);
                if (settingFragment == null) {
                    settingFragment = new SettingFragment();
                    transaction.add(R.id.content, settingFragment);
                } else {
                    transaction.show(settingFragment);
                }
                break;
            default:
                break;
        }
        transaction.commit();
    }


    private void hideFragments(FragmentTransaction transaction) {
        if (profileFragment != null) {
            transaction.hide(profileFragment);
        }
        if (browseFragment != null) {
            transaction.hide(browseFragment);
        }

        if (messageFragment != null) {
            transaction.hide(messageFragment);

        }
        if (settingFragment != null) {
            transaction.hide(settingFragment);

        }
    }

    private void clearSelection() {
        profileImage.setImageResource(R.drawable.manageprofile);
        browseImage.setImageResource(R.drawable.browseimage);
        messageImage.setImageResource(R.drawable.messageimage);
        settingImage.setImageResource(R.drawable.settingsimage);

    }


}
