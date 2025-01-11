import fs from 'fs/promises';
import path from 'path';
import { Fragment } from 'react';

export default function ProductDetailPage (props) {
    const { loadedProduct } = props;

    if (!loadedProduct) {
        return <p>Loading...</p>
    }

    return (
        <Fragment>
            <h1>{loadedProduct.title}</h1>
            <p>{loadedProduct.description}</p>
        </Fragment>
    )
}

async function getData() {
    const filePath = path.join(process.cwd(), 'data', 'dummy-backend.json')
    const jsonData = await fs.readFile(filePath)
    const data = JSON.parse(jsonData);

    return data;
}

export async function getStaticProps(context) {
    const {params} = context

    const data = await getData();

    const productId = params.pid;

    const product = data.products.find(product => product.id === productId)

    if (!product) {
        return {
            notFound: true
        }
    }

    return {
        props: {
            loadedProduct : product
        }
    }
}

export async function getStaticPaths() {
    const data = await getData();
    // paths[i] == context
     const ids = data.products.map(product => product.id)

    const params = ids.map(id => ({ params: { pid: id} }))

    return {
        paths: params,
        fallback: true,
    }
}