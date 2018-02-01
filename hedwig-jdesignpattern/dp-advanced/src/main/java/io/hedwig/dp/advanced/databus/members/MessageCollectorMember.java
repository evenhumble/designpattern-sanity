package io.hedwig.dp.advanced.databus.members;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import io.hedwig.dp.advanced.databus.DataType;
import io.hedwig.dp.advanced.databus.Member;
import io.hedwig.dp.advanced.databus.data.MessageData;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MessageCollectorMember implements Member {


  private final String name;

  private List<String> messages = new ArrayList<>();

  public MessageCollectorMember(String name) {
    this.name = name;
  }

  @Override
  public void accept(final DataType data) {
    if (data instanceof MessageData) {
      handleEvent((MessageData) data);
    }
  }

  private void handleEvent(MessageData data) {
    log.info(String.format("%s sees message %s", name, data.getMessage()));
    messages.add(data.getMessage());
  }

  public List<String> getMessages() {
    return Collections.unmodifiableList(messages);
  }
}