package com.dq.akka.demo;

import akka.actor.typed.ActorRef;
import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.Receive;

public class GreeterMain extends AbstractBehavior<GreeterMain.SayHello> {

    private final ActorRef<Greeter.Greet> greeter;

    public GreeterMain(ActorContext<SayHello> context) {
        super(context);
        greeter = context.spawn(Greeter.create(), "greeter");
    }

    public static Behavior<SayHello> create() {
        return Behaviors.setup(GreeterMain::new);
    }

    @Override
    public Receive<GreeterMain.SayHello> createReceive() {
        return newReceiveBuilder().onMessage(SayHello.class, this::onSayHello).build();
    }

    private Behavior<SayHello> onSayHello(SayHello command) {
        //#create-actors
        ActorRef<Greeter.Greeted> replyTo =
                getContext().spawn(GreeterBot.create(100), command.name);
        greeter.tell(new Greeter.Greet(command.name, replyTo));
        //#create-actors
        return this;
    }

    public static class SayHello {
        public final String name;

        public SayHello(String name) {
            this.name = name;
        }
    }
}
