package com.github.alexvishneuski.vkbestclient.repository.networking.vkapi.network;

import com.github.alexvishneuski.vkbestclient.repository.networking.vkapi.model.objects.basic.VKApiDialog;
import com.github.alexvishneuski.vkbestclient.repository.networking.vkapi.requestparams.VKApiUri;

import java.util.List;

public interface IDialogVKApiNetworking {

    List<VKApiDialog> getDialogs(VKApiUri pUri);

    int getDialogsTotalCount(VKApiUri pUri);
}
