<template>

    <v-data-table
        :headers="headers"
        :items="itemView"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'ItemViewView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            itemView : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/itemViews'))

            temp.data._embedded.itemViews.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.itemView = temp.data._embedded.itemViews;
        },
        methods: {
        }
    }
</script>

