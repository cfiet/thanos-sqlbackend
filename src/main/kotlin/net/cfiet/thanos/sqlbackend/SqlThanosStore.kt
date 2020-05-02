package net.cfiet.thanos.sqlbackend

import io.thanos.protobuf.store.Rpc
import io.thanos.protobuf.store.StoreGrpc
import org.lognet.springboot.grpc.GRpcService
import io.grpc.stub.StreamObserver
import io.thanos.protobuf.prom.Types

@GRpcService
class SqlThanosStore : StoreGrpc.StoreImplBase() {
    override fun info(request: Rpc.InfoRequest?, responseObserver: StreamObserver<Rpc.InfoResponse>?) {
        responseObserver!!.onNext(INFO_RESPONSE)
        responseObserver!!.onCompleted()
    }

    override fun labelNames(request: Rpc.LabelNamesRequest?, responseObserver: StreamObserver<Rpc.LabelNamesResponse>?) {
        super.labelNames(request, responseObserver)
    }

    override fun labelValues(request: Rpc.LabelValuesRequest?, responseObserver: StreamObserver<Rpc.LabelValuesResponse>?) {
        super.labelValues(request, responseObserver)
    }

    override fun series(request: Rpc.SeriesRequest?, responseObserver: StreamObserver<Rpc.SeriesResponse>?) {
        super.series(request, responseObserver)
    }


    companion object {
        private val INFO_RESPONSE: Rpc.InfoResponse = Rpc.InfoResponse.newBuilder()
                .setStoreType(Rpc.StoreType.STORE)
                .addAllLabelSets(listOf(
                    Rpc.LabelSet.newBuilder()
                        .addLabels(io.thanos.protobuf.store.Types.Label.newBuilder()
                            .setName("Hello")
                            .setValue("World")
                        )
                        .build()
                ))
                .build()
    }
}
