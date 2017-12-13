package com.github.alexvishneuski.vkbestclient.interactor.impl;

import android.util.Log;

import com.github.alexvishneuski.vkbestclient.datamodel.Dialog;
import com.github.alexvishneuski.vkbestclient.interactor.IDialogInteractor;
import com.github.alexvishneuski.vkbestclient.repository.networking.vkapi.model.objects.basicobjects.VKApiDialog;
import com.github.alexvishneuski.vkbestclient.repository.networking.vkapi.network.IDialogVKApiNetworking;
import com.github.alexvishneuski.vkbestclient.repository.networking.vkapi.network.impl.DialogVKApiNetworkingImpl;

import java.util.ArrayList;
import java.util.List;

public class DialogInteractorImpl implements IDialogInteractor {

    private final String TAG = this.getClass().getSimpleName();

    private IDialogVKApiNetworking mDialogVKApiNetworkingImpl = new DialogVKApiNetworkingImpl();

    @Override
    public List<VKApiDialog> getDialogList() {
        Log.d(TAG, "getDialogList: ");
        List<VKApiDialog> dialogs = new ArrayList<>();
        dialogs.addAll(mDialogVKApiNetworkingImpl.getDialogList().getDialogList());
        Log.d(TAG, "getDialogList: ");

        return dialogs;
    }

    @Override
    public List<Dialog> getDialogList(int pCount) {

        return null;
    }

    @Override
    public String getResultAsString() {
        Log.d(TAG, "getResultAsString called");
        String result = mDialogVKApiNetworkingImpl.getDialogListAsString();
        Log.d(TAG, "getResultAsString returned");

        return result;
    }
}
